package advjava._digitalsignature;

import java.io.*;
import java.security.*;


public class GenerateDigitalSignature {
    private static String FILE_PATH="G:\\IdeaProjects\\javalearn\\src\\advjava\\_digitalsignature\\resources\\";
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: nameOfFileToSign");
        } else try {
            /* Generate a key pair */

            // DSA - Digital Signature Algorithm
            // SUN - it is the default provider that is in-built in JDK.
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");

            // SHA1PRNG - the name of the RNG(Random Number Generator) algorithm
            // SUN - it is the default provider that is in-built in JDK.
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");

            //For DSA, the key size is 1024.
            keyGen.initialize(1024, random);

            KeyPair pair = keyGen.generateKeyPair();

            PrivateKey priv = pair.getPrivate();

            PublicKey pub = pair.getPublic();

            /* Create a Signature object and initialize it with the private key */

            //SHA-1 is a message-digest, and DSA is a signature algorithm
            //message digest - The function on which temper detection and authentication depend is called the one-way hash.
            // It is also known as a message digest.
            Signature dsa = Signature.getInstance("SHA1withDSA", "SUN");
            dsa.initSign(priv);


            /* Update and sign the data */
            FileInputStream fis = new FileInputStream(FILE_PATH+"digital.txt");

            BufferedInputStream bufin = new BufferedInputStream(fis);
            byte[] buffer = new byte[1024];
            int len;
            while (bufin.available() != 0) {
                len = bufin.read(buffer);
                dsa.update(buffer, 0, len);
            }

            bufin.close();

            /* Now that all the data to be signed has been read in,generate a signature for it */
            byte[] realSig = dsa.sign();


            /* Save the signature in a file */
            FileOutputStream sigfos = new FileOutputStream(FILE_PATH+"signature.txt");
            sigfos.write(realSig);
            sigfos.close();

            /* Save the public key in a file */
            byte[] key = pub.getEncoded();
            FileOutputStream keyfos = new FileOutputStream(FILE_PATH+"publickey.txt");
            keyfos.write(key);
            keyfos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
