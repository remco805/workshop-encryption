package workshop.encryption.exercise4;

import java.util.HashMap;
import java.util.Map;

import org.abstractj.kalium.keys.KeyPair;
import org.abstractj.kalium.keys.PrivateKey;
import org.abstractj.kalium.keys.PublicKey;

import workshop.encryption.exercise3.Application;
import workshop.encryption.exercise3.User;

public class SharingUser extends User {
    
    private EncryptedPrivateKey privateKey;
    private PublicKey publicKey;
    
    private Map<String, AsymmetricEncryptedString> sharedContentKeys =
            new HashMap<String, AsymmetricEncryptedString>();

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
        String contentKey = Application.SESSION.getContentKey(this);
        otherUser.sharedContentKeys.put(getUsername(),
                new AsymmetricEncryptedString(otherUser.getPublicKey(), Application.SESSION.getPrivateKey(), contentKey));
    }
    
    public String getSharedContentKey(SharingUser otherUser) {
        AsymmetricEncryptedString sharedContentKey = sharedContentKeys.get(otherUser.getUsername());
        return sharedContentKey.getValue(Application.SESSION.getPrivateKey(), otherUser.getPublicKey());
    }
}