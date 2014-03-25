package workshop.encryption.exercise3;

public class SecureSession {

    private final User currentUser;
    private final String currentUserContentKey;  
    
    public SecureSession(User currentUser, String currentUserContentKey) {
        this.currentUser = currentUser;
        this.currentUserContentKey = currentUserContentKey;
    }
    
    public String getContentKey(User user) {
        if (this.currentUser.equals(user)) {
            return this.currentUserContentKey;
        }
        
        return null;
    }
}