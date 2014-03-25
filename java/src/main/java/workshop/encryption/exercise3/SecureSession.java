package workshop.encryption.exercise3;

import org.abstractj.kalium.keys.PrivateKey;

import workshop.encryption.exercise4.SharingUser;

public class SecureSession {

    private final User currentUser;
    private final String currentUserContentKey;  
    private final PrivateKey currentUserPrivateKey;
    
    public SecureSession(User currentUser, String currentUserContentKey, PrivateKey currentUserPrivateKey) {
        this.currentUser = currentUser;
        this.currentUserContentKey = currentUserContentKey;
        this.currentUserPrivateKey = currentUserPrivateKey;
    }
    
    public String getContentKey(User user) {
        if (this.currentUser.equals(user)) {
            return this.currentUserContentKey;
        }
        
        return ((SharingUser) this.currentUser).getSharedContentKey((SharingUser) user);
    }
    
    public PrivateKey getPrivateKey() {
        return currentUserPrivateKey;
    }
}