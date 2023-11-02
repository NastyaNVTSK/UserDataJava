public class BirthdayDataUserException extends UserException{

    private final String birthday;

    public String getBirthday() {
        return birthday;
    }

    public BirthdayDataUserException(String message, String birthday) {
        super(message);
        this.birthday = birthday;
    }
    
}
