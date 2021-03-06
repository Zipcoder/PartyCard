package PCard.Domain;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by rkelly on 3/18/16.
 */
public class AuthenticationTest {

    static UserAccount user;

    @BeforeClass
    public static void setup() throws IOException {
        user = UserAccount.createAccount("Drury", "pass3","bob@email.com", "56c66be6a73e492741507f89");
    }

    @Before
    public void testAuthenticate() throws Exception {
        assertEquals(true, Authentication.authenticate("Drury","pass3"));
    }

    @Test
    public void testNameAvailable() throws Exception {
        UserAccount user2 = UserAccount.createAccount("Drury", "pass3","bob@email.com", "56c66be6a73e492741507f89");
        assertEquals(null,user2);
    }


    @Test
    public void testEmailAvailable() throws Exception {
        UserAccount user2 = UserAccount.createAccount("Drury", "pass3","bob@email.com", "56c66be6a73e492741507f89");
        assertEquals(null,user2);
    }
}