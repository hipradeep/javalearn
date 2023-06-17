package projects.encryptdecryptfile;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class EncryptionUtils {

    private static final String AES_ALGORITHM = "AES";
    private static final int KEY_LENGTH_BITS = 256;

    public static void encryptFile(File inputFile, File outputFile, String secretKey) throws Exception {
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        encryptStream(inputStream, outputStream, secretKey);
        inputStream.close();
        outputStream.close();
    }

    public static void decryptFile(File inputFile, File outputFile, String secretKey) throws Exception {
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        decryptStream(inputStream, outputStream, secretKey);
        inputStream.close();
        outputStream.close();
    }

    private static void encryptStream(FileInputStream inputStream, FileOutputStream outputStream, String secretKey) throws Exception {
        byte[] keyBytes = hexToBytes(secretKey);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        byte[] inputBytes = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(inputBytes)) != -1) {
            byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
            if (outputBytes != null) {
                outputStream.write(outputBytes);
            }
        }

        byte[] outputBytes = cipher.doFinal();
        if (outputBytes != null) {
            outputStream.write(outputBytes);
        }
    }

    private static void decryptStream(FileInputStream inputStream, FileOutputStream outputStream, String secretKey) throws Exception {

        byte[] keyBytes = hexToBytes(secretKey);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

        byte[] inputBytes = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(inputBytes)) != -1) {
            byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
            if (outputBytes != null) {
                outputStream.write(outputBytes);
            }
        }

        byte[] outputBytes = cipher.doFinal();
        if (outputBytes != null) {
            outputStream.write(outputBytes);
        }
    }

    public static String generateSecretKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES_ALGORITHM);
        keyGenerator.init(KEY_LENGTH_BITS, SecureRandom.getInstanceStrong());
        SecretKey secretKey = keyGenerator.generateKey();
        return bytesToHex(secretKey.getEncoded());
    }


    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }

    private static byte[] hexToBytes(String hexString) {
        int len = hexString.length();
        byte[] bytes = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            bytes[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return bytes;
    }
}