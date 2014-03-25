package workshop.encryption.exercise3;

import helpers.RandomKey;

public class User {
    
    private String username;
    
    private EncryptedString encryptedContentKey;
    private EncryptedString encryptedName;
    private String gender;
    
    public User(String username, String password) {
        String contentKey = new String(new RandomKey().getBytes());
        this.encryptedContentKey = new EncryptedString(password, contentKey);
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public String getContentKey(String password) {
        return this.encryptedContentKey.getValue(password);
    }
    
    public void setName(String name) {
        this.encryptedName = new EncryptedString(Application.SESSION.getContentKey(this), name);
    }
    
    public String getName() {
        return this.encryptedName.getValue(Application.SESSION.getContentKey(this));
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
}