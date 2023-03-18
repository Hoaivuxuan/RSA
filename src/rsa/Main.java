package rsa;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author vuxuanhoai
 */
public class Main {
    public static void main(String[] args) {
        RSA person1 = new RSA();
        RSA person2 = new RSA();
        //
        person1.initialize_RSA();
        person2.initialize_RSA();
        //
        Scanner cin = new Scanner(System.in);  
        System.out.print("Message: ");        
        String message = cin.nextLine();
        byte[] plaintextBytes = message.getBytes();
        BigInteger P = new BigInteger(plaintextBytes);


        // ma hoa thong tin gui di
        BigInteger encryptedMessage =  person1.encrypt(P, person2.getN());
        System.out.println("Encrypted message: " + encryptedMessage);

        //thong tin gui di va de bi lay cap tren duong truyen
        System.out.println(encryptedMessage);

        //thong tin den nguoi nhan va dung khoa bi mat (d,n) de giai ma
        BigInteger decryptedMessage = person2.decrypt(encryptedMessage);


        byte[] decryptedBytesdemo = decryptedMessage.toByteArray();
        String result = new String(decryptedBytesdemo);     
        System.out.println("Decrypted message: " + result);
    }
}
