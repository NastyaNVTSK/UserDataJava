public class GenderUserException extends UserException {

    private final String gender;

    public String getGender() {
        return gender;
    }

    public GenderUserException(String message, String gender) {
        super(message);
        this.gender = gender;
    }
    
}
