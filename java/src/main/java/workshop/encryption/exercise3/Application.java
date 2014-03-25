package workshop.encryption.exercise3;

import org.abstractj.kalium.keys.PrivateKey;

import workshop.encryption.exercise4.SharingUser;

public class Application {

    public static SecureSession SESSION;
    public static Users USERS = new Users();

    public void login(String username, String password) throws Exception {
        SharingUser user = USERS.get(username);
        String contentKey = user.getContentKey(password);
        PrivateKey privateKey = user.getPrivateKey(password);
        
        SESSION = new SecureSession(user, contentKey, privateKey);
    }
}