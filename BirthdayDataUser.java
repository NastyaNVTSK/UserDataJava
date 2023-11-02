import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class BirthdayDataUser {

    private final LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public BirthdayDataUser(String birthday) throws BirthdayDataUserException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            this.birthday = LocalDate.parse(birthday, formatter);
        } catch (DateTimeParseException e) {
            throw new BirthdayDataUserException("Некорректный формат даты рождения", birthday);
        }
    }
    
}
