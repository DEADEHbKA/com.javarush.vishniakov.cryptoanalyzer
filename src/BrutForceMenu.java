import java.util.Scanner;

public class BrutForceMenu {
    private String fileName;


    public void brutForceMenu() {
        System.out.println("*".repeat(45));
        System.out.println("Метод BrutForce позволяет расшифровать файл перебором всех возможных вариантов ключей.");
        System.out.println("После работы методы BrutForce вы увидите несколько файлов.\nВам нужно самостоятельно выбрать файл, \nв котором будет правильно расшифрованный текст");
        System.out.println("*".repeat(45));
        boolean b = false;
        System.out.println("Введите путь к зашифрованному файлу");
        Scanner console = new Scanner(System.in);
        while (!b) {
            fileName = console.nextLine();
            b = Validator.validFile(fileName);
        }
        System.out.println("*".repeat(45));
        System.out.println("Выберете файл в котором читаемый расшифрованный текст");
        System.out.println("*".repeat(45));
        BrutForce brutForce = new BrutForce();
        brutForce.brutForce(fileName);
        System.out.println("*".repeat(45));
        UserInterface userInterface = new UserInterface();
        userInterface.start();
    }
}
