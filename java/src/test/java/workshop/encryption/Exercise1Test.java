package workshop.encryption;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import helpers.RandomKey;
import helpers.RandomNonce;

import org.junit.Test;

import workshop.encryption.exercise1.Symmetric;

/**
 * Exercise 1: symmetric encryption
 * 
 */
public class Exercise1Test {

    @Test
    public void decryptsMessage() {
        RandomKey key = new RandomKey();
        RandomNonce nonce = new RandomNonce();
        byte[] message = "a certain message".getBytes();
        
        byte[] encryptedMessage = Symmetric.encrypt(key, nonce, message);
        byte[] decryptedMessage = Symmetric.decrypt(key, nonce, encryptedMessage);
        
        assertThat(decryptedMessage, is(equalTo(message)));
    }
}