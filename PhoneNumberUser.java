public class PhoneNumberUser {

    private final long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumberUser(String phoneNumber) throws PhoneNumberUserException {
        try {
            this.phoneNumber = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new PhoneNumberUserException("Некорректный формат номера телефона", phoneNumber);
        }
    }
    
}
