package projects.encryptdecryptfile;

import java.io.File;
import java.security.NoSuchAlgorithmException;

public class Driver {

private static final String filePath="C:\\Users\\hipradeep\\Documents\\java\\src\\projects\\encryptdecryptfile\\files\\";


    public static void main(String[] args) throws Exception {
        //original fire
        File inputFile = new File(filePath+"v_file.mp4");
        //encrypted file to be store here
        File encryptedFile = new File(filePath+"encrypted_v_file.mp4");
        //generate secrete key
        String secretKey = EncryptionUtils.generateSecretKey();

        //encrypt file
        EncryptionUtils.encryptFile(inputFile, encryptedFile, secretKey);

        System.out.println("Encryption done");


        //decrypt file
        String secretKey22 = secretKey; // Provide the correct secret key used for encryption
        File decryptedFile = new File(filePath+"decrypted_v_file.mp4");
        EncryptionUtils.decryptFile(encryptedFile, decryptedFile, secretKey22);

        System.out.println("Decryption done");
    }
}
