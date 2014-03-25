package workshop.encryption.exercise2;

import helpers.RandomNonce;

import org.abstractj.kalium.crypto.Box;
import org.abstractj.kalium.keys.KeyPair;
import org.abstractj.kalium.keys.PrivateKey;
import org.abstractj.kalium.keys.PublicKey;

public class Asymmetric {
    
    public static byte[] encrypt(PublicKey receiverPublicKey,
            PrivateKey senderPrivateKey, RandomNonce nonce, byte[] message) {
        Box box = new Box(receiverPublicKey, senderPrivateKey);
        return box.encrypt(nonce.getBytes(), message);
    }
    
    public static byte[] decrypt(PrivateKey receiverPrivateKey,
            PublicKey senderPublicKey, RandomNonce nonce, byte[] encryptedMessage) {
        Box box = new Box(senderPublicKey, receiverPrivateKey);
        return box.decrypt(nonce.getBytes(), encryptedMessage);
    }

    public static class Sender {
        private static final KeyPair KEYPAIR = new KeyPair();
        public static final PublicKey PUBLIC_KEY = KEYPAIR.getPublicKey();
        public static final PrivateKey PRIVATE_KEY = KEYPAIR.getPrivateKey();
    }
    
    public static class Receiver {
        private static final KeyPair KEYPAIR = new KeyPair();
        public static final PublicKey PUBLIC_KEY = KEYPAIR.getPublicKey();
        public static final PrivateKey PRIVATE_KEY = KEYPAIR.getPrivateKey();
    }
}