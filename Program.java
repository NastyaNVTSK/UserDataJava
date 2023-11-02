import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные пользователя (Фамилия Имя Отчество Дата Рождения Номер Телефона Пол):");
            String userDataInput = scanner.nextLine();
            String[] userData = userDataInput.split(" ");

            try {
                User user = User.create(userData);
                System.out.println("Данные пользователя:");
                System.out.println("Фамилия: " + user.getLastName());
                System.out.println("Имя: " + user.getFirstName());
                System.out.println("Отчество: " + user.getMiddleName());
                System.out.println("Дата рождения: " + user.getBirthdayData().getBirthday());
                System.out.println("Номер телефона: " + user.getPhoneNumberData().getPhoneNumber());
                System.out.println("Пол: " + user.getGenderData().getGender());
            } catch (UserException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
    
}
