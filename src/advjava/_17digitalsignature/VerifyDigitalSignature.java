package advjava._17digitalsignature;

import java.io.*;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;

public class VerifyDigitalSignature {
    private static String FILE_PATH="G:\\IdeaProjects\\javalearn\\src\\advjava\\_digitalsignature\\resources\\";
    public static void main(String[] args) {

        /* Verify a DSA signature */
        if (args.length != 3) {
            System.out.println("Usage: VerifyDigitalSignature " + "publickeyfile signaturefile " + "datafile");
        } else try {
            /* import encoded public key */
            FileInputStream keyfis = new FileInputStream(FILE_PATH+"publickey.txt");
            //converting encoded public key bytes
            byte[] encKey = new byte[keyfis.available()];
            keyfis.read(encKey);
            keyfis.close();

            //conversion between opaque keys (key type)(i.e. encKey) and key specifications.
            X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(encKey);

            KeyFactory keyFactory = KeyFactory.getInstance("DSA", "SUN");

            PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);

            /* input the signature bytes */
            FileInputStream sigfis = new FileInputStream(FILE_PATH+"signature.txt");
            byte[] sigToVerify = new byte[sigfis.available()];
            sigfis.read(sigToVerify);
            sigfis.close();

            /* create a Signature object and initialize it with the public key */
            Signature sig = Signature.getInstance("SHA1withDSA", "SUN");
            sig.initVerify(pubKey);

            /* Update and verify the data */
            FileInputStream datafis = new FileInputStream(FILE_PATH+"digital.txt");
            BufferedInputStream bufin = new BufferedInputStream(datafis);
            byte[] buffer = new byte[1024];
            int len;
            while (bufin.available() != 0) {
                len = bufin.read(buffer);
                sig.update(buffer, 0, len);
            }
            ;
            bufin.close();

            boolean verifies = sig.verify(sigToVerify);
            System.out.println("signature verifies: " + verifies);

        } catch (
                Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    }

}
