package java_registration1;

import java.util.regex.Pattern;

public class UserRegistration {
        private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
        private static final String EMAIL = "^(abc)[.0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$";
        private static final String PHONE_NUMBER = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
        private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

        public UserRegistrationInterface firstNameValidate = new UserRegistrationInterface() {
                public boolean userEntries(String fName) throws InvalidUserInputExp {
                        boolean result = Pattern.matches(NAME, fName);
                        if (result) {
                                return result;
                        } else {
                                throw new InvalidUserInputExp(InvalidUserInputExp.ExceptionType.INVALID_FIRST_NAME,
                                        "Invalid Firsrt Name");
                        }
                }
        };

        public UserRegistrationInterface lastNameValidate = new UserRegistrationInterface() {
                public boolean userEntries(String lName) throws InvalidUserInputExp {
                        boolean result = Pattern.matches(NAME, lName);
                        if (result) {
                                return result;
                        } else {
                                throw new InvalidUserInputExp(InvalidUserInputExp.ExceptionType.INVALID_LAST_NAME,
                                        "Invalid Last Name");
                        }
                }
        };

        public UserRegistrationInterface emailValidate = new UserRegistrationInterface() {
                public boolean userEntries(String email) throws InvalidUserInputExp {
                        boolean result = Pattern.matches(EMAIL, email);
                        if (result) {
                                return result;
                        } else {
                                throw new InvalidUserInputExp(InvalidUserInputExp.ExceptionType.INVALID_EMAIL, "Invalid Email");
                        }
                }
        };

        public UserRegistrationInterface phoneNumberValidate = new UserRegistrationInterface() {
                public boolean userEntries(String phNum) throws InvalidUserInputExp {
                        boolean result = Pattern.matches(PHONE_NUMBER, phNum);
                        if (result) {
                                return result;
                        } else {
                                throw new InvalidUserInputExp(InvalidUserInputExp.ExceptionType.INVALID_PHONE_NUMBER,
                                        "Invalid Phone Number");
                        }
                }
        };

        public UserRegistrationInterface passwordValidate = new UserRegistrationInterface() {
                public boolean userEntries(String pw) throws InvalidUserInputExp {
                        boolean result = Pattern.matches(PASSWORD, pw);
                        if (result) {
                                return result;
                        } else {
                                throw new InvalidUserInputExp(InvalidUserInputExp.ExceptionType.INVALID_PASSWORD,
                                        "Invalid Password");
                        }
                }
        };
}