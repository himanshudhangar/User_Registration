package java_registration1;

public class InvalidUserInputExp extends Exception {
    enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PASSWORD, INVALID_PHONE_NUMBER, INVALID_EMAIL;
    }

    ExceptionType type;

    public InvalidUserInputExp(ExceptionType type, String msg) {
        super(msg);
        this.type = type;
    }
}