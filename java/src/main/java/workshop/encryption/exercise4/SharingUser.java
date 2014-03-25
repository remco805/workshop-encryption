package workshop.encryption.exercise4;

import org.abstractj.kalium.keys.KeyPair;
import org.abstractj.kalium.keys.PrivateKey;
import org.abstractj.kalium.keys.PublicKey;

import workshop.encryption.exercise3.User;

public class SharingUser extends User {
    
    private EncryptedPrivateKey privateKey;
    private PublicKey publicKey;

    public SharingUser(String username, String password) {
        super(username, password);

        KeyPair keypair = new KeyPair();
        this.privateKey = new EncryptedPrivateKey(password, keypair.getPrivateKey());
        this.publicKey = keypair.getPublicKey();
    }
    
    public PrivateKey getPrivateKey(String password) {
        return this.privateKey.getValue(password);
    }
    
    public PublicKey getPublicKey() {
        return this.publicKey;
    }
    
    public void shareContentKeyWith(SharingUser otherUser) {
        
        /**
         * TODO: implement this method
         * - get the contentKey of the logged in user
         * - get the privateKey of the logged in user (hint you should add this to Application.SESSION)
         * - store the contentKey of the logged in user in a map of sharedContentKeys for otherUser, i.e. Map<String, AsymmetricEncryptedString>
         * 
         */

    }
    
    public String getSharedContentKey(SharingUser otherUser) {
        
        /**
         * TODO: implement this method
         * - get the (encrypted) sharedContentKey from the map of sharedContentKeys
         * - decrypt the the content key
         * 
         */

        return null;
    }
}