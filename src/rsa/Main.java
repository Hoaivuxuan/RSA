/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rsa;

import java.math.BigInteger;

/**
 * @author vuxua
 */
public class Main {
    public static void main(String[] args) {
        RSA person1 = new RSA();
        RSA person2 = new RSA();
        
        person1.initialize_RSA();
        person2.initialize_RSA();
        
        BigInteger message = new BigInteger("23052021");
        BigInteger cipher =  person1.encrypt(message, person2.getN());
        
        BigInteger decrypted = person2.decrypt(cipher);
        
        System.out.println(message);
        System.out.println(decrypted);
    }
}
