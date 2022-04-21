package java_registrationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import java_registration1.User_Validation;
import junit.framework.Assert;

public class User_Validation_Test1 {


		public class UserValidTest {

			 @Test
			    public void firstName_Validation() {
			        User_Validation validation = new User_Validation();
			        boolean actualResult = validation.firstName("Himanshu");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void lastName_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.lastName("Dhangar");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void email_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.email("himanshudhangar06@gmail.com");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void phoneNumber_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.phoneNumber("+919168112901");
			        Assert.assertTrue(actualResult);
			    }

			    @Test
			    public void password_Validation() {
			    	User_Validation validation = new User_Validation();
			        boolean actualResult = validation.password("qw1rt@Ms");
			        Assert.assertTrue(actualResult);
			    }
				    }
		
	}


