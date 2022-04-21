package java_registrationTest;

import org.junit.Assert;
import org.junit.Test;

import java_registration1.User_Validation;

public class User_ValidTest {

	@Test
	public void test() {
		class UserValidationTest {

			 @Test
			    public void firstName_Validation() {
			        User_Validation validation = new User_Validation();
			        boolean actualResult = validation.firstName("Hemraj");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void lastName_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.lastName("Kumar");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void email_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.email("hemraj007@gmail.com");
			        Assert.assertTrue(actualResult);
			    }

	}

	}
}