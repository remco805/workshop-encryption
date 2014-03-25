package workshop.encryption.exercise1;

import helpers.HashedKey;
import helpers.RandomNonce;

import org.abstractj.kalium.crypto.SecretBox;

public class Symmetric {

    public static byte[] encrypt(HashedKey key, RandomNonce nonce, byte[] message) {
        SecretBox box = new SecretBox(key.getBytes());
        return box.encrypt(nonce.getBytes(), message);
    }

    public static byte[] decrypt(HashedKey key, RandomNonce nonce, byte[] encryptedMessage) {
        SecretBox box = new SecretBox(key.getBytes());
        return box.decrypt(nonce.getBytes(), encryptedMessage);
    }
}