package workshop.encryption;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import workshop.encryption.exercise3.Application;
import workshop.encryption.exercise3.User;

/**
 * Exercise 3: encrypt personal details with a password
 * 
 */
public class Exercise3Test {

    private Application application;

    @Before
    public void setUp() {
        application = new Application();
        Application.USERS.add("user", "a password");
    }

    @Test(expected=Exception.class)
    public void failsWithoutLogin() throws Exception {
        User user = Application.USERS.get("user");
        user.setName("a developer");
    }
    
    @Test
    public void decryptsPersonalInformation() throws Exception {
        application.login("user", "a password");

        User user = Application.USERS.get("user");
        user.setName("a developer");
        user.setGender("m");

        assertThat(user.getName(), is(equalTo("a developer")));
        assertThat(user.getGender(), is(equalTo("m")));
    }
}