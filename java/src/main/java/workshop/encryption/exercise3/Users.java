package workshop.encryption.exercise3;

import java.util.HashMap;
import java.util.Map;

import workshop.encryption.exercise4.SharingUser;

public class Users {

    private Map<String, SharingUser> users = new HashMap<String, SharingUser>();
    
    public void add(String username, String password) {
        SharingUser user = new SharingUser(username, password);
        users.put(username, user);
    }
    
    public SharingUser get(String username) {
        return users.get(username);
    }
}
