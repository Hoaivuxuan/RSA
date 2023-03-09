/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rsa;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vuxuanhoai
 */
public class Main {
    public static void main(String[] args) {
        RSA person1 = new RSA();
        RSA person2 = new RSA();
        
        person1.initialize_RSA();
        person2.initialize_RSA();
        // Mã hóa
        Scanner cin = new Scanner(System.in);  
        System.out.print("Message: ");
        BigInteger message = cin.nextBigInteger();
        BigInteger encryptedMessage =  person1.encrypt(message, person2.getN());
        // Giải mã
        BigInteger decryptedMessage = person2.decrypt(encryptedMessage);
        
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
