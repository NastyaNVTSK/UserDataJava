public class User extends UserData {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final BirthdayDataUser birthdayData;
    private final PhoneNumberUser phoneNumberData;
    private final GenderUser genderData;

    private User(String firstName, String lastName, String middleName, BirthdayDataUser birthdayData, PhoneNumberUser phoneNumberData, GenderUser genderData) {
        super(firstName + " " + lastName + " " + middleName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthdayData = birthdayData;
        this.phoneNumberData = phoneNumberData;
        this.genderData = genderData;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public BirthdayDataUser getBirthdayData() {
        return birthdayData;
    }

    public PhoneNumberUser getPhoneNumberData() {
        return phoneNumberData;
    }

    public GenderUser getGenderData() {
        return genderData;
    }

    public static User create(String[] data) throws UserException {
        if (data.length != 6) {
            throw new UserException("Некорректное количество данных");
        }

        String firstName = data[0];
        String lastName = data[1];
        String middleName = data[2];
        String birthday = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        return new User(firstName, lastName, middleName, new BirthdayDataUser(birthday), new PhoneNumberUser(phoneNumber), new GenderUser(gender));
    }
}
