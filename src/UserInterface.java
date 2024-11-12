import java.util.Scanner;

public class UserInterface {

    public void start() {
        {
            System.out.println("Программа шифрования текста методом \"Цезаря\"");
            System.out.println("*".repeat(45));
            System.out.println("1 - Шифрование текста с ключем");
            System.out.println("2 - Расшифровка текста с ключем");
            System.out.println("3 - Расшифровка текста методом BrutForce");
            System.out.println("0 - Завершение работы");
            System.out.println("*".repeat(45));
            System.out.println("Выберите пункт меню:");
        }
        int choice = Integer.MIN_VALUE;
        Scanner console = new Scanner(System.in);
        while (choice < 0 || choice > 3 ) {
            boolean b = false;
            String tmpChoise = "";
            while (!b) {
                tmpChoise = console.nextLine();
                b = Validator.validKey(tmpChoise);
            }
            choice = Integer.parseInt(tmpChoise);
        }
        switch (choice) {
            case 1:
            EncryptMenu encryptMenu = new EncryptMenu();
            encryptMenu.encryptMenu();
            break;
            case 2:
            DecryptMenu decryptMenu = new DecryptMenu();
            decryptMenu.decryptMenu();
            break;
            case 3:
            BrutForceMenu brutForceMenu = new BrutForceMenu();
            brutForceMenu.brutForceMenu();
            break;
            case 0:
                System.out.println("Ну штош, значит сегодня выходной");
                System.exit(0);
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}

