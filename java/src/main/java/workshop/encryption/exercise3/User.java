package workshop.encryption.exercise3;

public class User {
    
    private String username;
    private String gender;
    
    public User(String username, String password) {
        
        /**
         * TODO: implement this method
         * - create a new contentKey (tip: use helpers.RandomKey) - it should be a string
         * - the contenKey should be encrypted with the password of the user
         * - use EncryptedString for storing an encrypted value
         * 
         */
        
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public String getContentKey(String password) {
        
        /**
         * TODO: implement this method
         * 
         */
        
        return null;
    }
    
    public void setName(String name) {
        
        /**
         * TODO: implement this method
         * - store the name in an EncryptedString
         * - the name should be encrypted with the contentKey of the user
         * - hint: the contentKey is stored in the session of the user
         * 
         */

    }
    
    public String getName() {
        
        /**
         * TODO: implement this method
         * 
         */
        
        return null;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
}