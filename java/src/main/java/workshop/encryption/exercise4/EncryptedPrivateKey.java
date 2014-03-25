package workshop.encryption.exercise4;

import helpers.HashedKey;
import helpers.RandomNonce;

import org.abstractj.kalium.keys.PrivateKey;

import workshop.encryption.exercise1.Symmetric;

public class EncryptedPrivateKey {

    private byte[] ciphertext;
    private RandomNonce nonce;
    
    public EncryptedPrivateKey(String key, PrivateKey privateKey) {
        this.nonce = new RandomNonce();
        this.ciphertext = Symmetric.encrypt(new HashedKey(key.getBytes()), nonce, privateKey.toBytes());
    }

    public PrivateKey getValue(String key) {
        return new PrivateKey(Symmetric.decrypt(new HashedKey(key.getBytes()), this.nonce, this.ciphertext));
    }
}