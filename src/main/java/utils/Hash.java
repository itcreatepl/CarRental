package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    private String input;

    public Hash(String input) {
        this.input = input;
    }

    public String hash() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            byte[] resut = digest.digest(input.getBytes());
            return String.format("%064x", new BigInteger(1,resut));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not hash password");
        }
    }
}
