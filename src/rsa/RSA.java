package rsa;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author vuxuanhoai
 */
public class RSA {
    // Tạo khóa
    public static final  int bitLength = 2048;
    public static final BigInteger E = new BigInteger("65537"); // E là số nguyên tố
    
    private BigInteger p;
    private BigInteger q;
    private BigInteger n; // n = p * q
    private BigInteger phiN; // φ(n) = (p-1) * (q-1)
    private BigInteger d; // d*e mod φ(n) = 1
    
    public void initialize_RSA () {
        p = BigInteger.probablePrime(bitLength/2, new Random()); // số nguyên tố lớn ngẫu nhiên
        q = BigInteger.probablePrime(bitLength/2, new Random()); // số nguyên tố lớn ngẫu nhiên
        n = p.multiply(q);
        phiN = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        d = E.modInverse(phiN);
    }
    // Mã hóa thông điệp
    public BigInteger encrypt (BigInteger message, BigInteger N) {
        return message.modPow(E, N);
    }


    // Giải mã thông điệp
    public BigInteger decrypt (BigInteger C) {
        return C.modPow(d, n);
    }

    public BigInteger getN() {
        return n;
    }
}
