package workshop.encryption;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import helpers.RandomNonce;

import org.junit.Test;

import workshop.encryption.exercise2.Asymmetric;
import workshop.encryption.exercise2.Asymmetric.Receiver;
import workshop.encryption.exercise2.Asymmetric.Sender;

/**
 * Exercise 2: asymmetric encryption
 * 
 */
public class Exercise2Test {

    @Test
    public void decryptsMessage() {
        RandomNonce nonce = new RandomNonce();
        byte[] message = "a certain message".getBytes();

        byte[] encryptedMessage = Asymmetric.encrypt(Receiver.PUBLIC_KEY, Sender.PRIVATE_KEY, nonce, message);
        byte[] decryptedMessage = Asymmetric.decrypt(Receiver.PRIVATE_KEY, Sender.PUBLIC_KEY, nonce, encryptedMessage);

        assertThat(decryptedMessage, is(equalTo(message)));
    }
}