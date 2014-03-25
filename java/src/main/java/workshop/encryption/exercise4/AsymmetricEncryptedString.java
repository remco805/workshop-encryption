package workshop.encryption.exercise4;

import org.abstractj.kalium.keys.PrivateKey;
import org.abstractj.kalium.keys.PublicKey;

public class AsymmetricEncryptedString {

    public AsymmetricEncryptedString(PublicKey receiverPublicKey, PrivateKey senderPrivateKey, String value) {
        
        /**
         * TODO: implement this method
         * - use exercise2.Asymmetric#encrypt
         * - hint: you should always use the same nonce for encrypting / decrypting
         * 
         */

    }

    public String getValue(PrivateKey receiverPrivateKey, PublicKey senderPublicKey) {
        
        /**
         * TODO: implement this method
         * - use exercise2.Asymmetric#decrypt
         * 
         */

        return null;
    }
}
