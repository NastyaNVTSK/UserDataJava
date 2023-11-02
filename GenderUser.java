public class GenderUser {

    private final char gender;

    public char getGender() {
        return gender;
    }

    public GenderUser(String gender) throws GenderUserException {
        if (gender.length() != 1 || (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f"))) {
            throw new GenderUserException("Некорректное значение пола", gender);
        }
        this.gender = gender.charAt(0);
    }
    
}
