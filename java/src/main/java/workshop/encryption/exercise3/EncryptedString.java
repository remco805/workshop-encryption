package workshop.encryption.exercise3;

import helpers.HashedKey;
import helpers.RandomNonce;
import workshop.encryption.exercise1.Symmetric;

public class EncryptedString {

    private byte[] ciphertext;
    private RandomNonce nonce;
    
    public EncryptedString(String key, String value) {
        this.nonce = new RandomNonce();
        this.ciphertext = Symmetric.encrypt(new HashedKey(key.getBytes()), nonce, value.getBytes());
    }

    public String getValue(String key) {
        return new String(Symmetric.decrypt(new HashedKey(key.getBytes()), this.nonce, this.ciphertext));
    }
}