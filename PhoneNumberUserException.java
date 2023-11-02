public class PhoneNumberUserException extends UserException {

    private final String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumberUserException(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }
    
}
