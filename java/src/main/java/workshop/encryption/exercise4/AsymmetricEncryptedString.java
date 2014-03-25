package workshop.encryption.exercise4;

import helpers.RandomNonce;

import org.abstractj.kalium.keys.PrivateKey;
import org.abstractj.kalium.keys.PublicKey;

import workshop.encryption.exercise2.Asymmetric;

public class AsymmetricEncryptedString {

    private byte[] ciphertext;
    private RandomNonce nonce;
    
    public AsymmetricEncryptedString(PublicKey receiverPublicKey, PrivateKey senderPrivateKey, String value) {
        this.nonce = new RandomNonce();
        this.ciphertext = Asymmetric.encrypt(receiverPublicKey, senderPrivateKey, nonce, value.getBytes());
    }

    public String getValue(PrivateKey receiverPrivateKey, PublicKey senderPublicKey) {
        return new String(Asymmetric.decrypt(receiverPrivateKey, senderPublicKey, nonce, ciphertext));
    }
}
