import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public  class EncryptMenu {
   private String fileName;
   private int key;

    public EncryptMenu() {}

    public void encryptMenu() {
        boolean b;
        System.out.println("Введите путь к шифруемому файлу");
        Scanner console = new Scanner(System.in);
        b = false;
        while (!b) {
            fileName = console.nextLine();
            b = Validator.validFile(fileName);
        }
        System.out.println("Введите ключ шифрования в диаппазоне от 1 до " + (Alphabet.getLengthAlphabet() - 1));
        String tmpKey = "";
        b = false;
        while (!b) {
            tmpKey = console.nextLine();
            b = Validator.validKey(tmpKey);
        }
        key = Integer.parseInt(tmpKey);
        FileManager fileManager = new FileManager();
        fileManager.setFileName(fileName);
        Path path = Paths.get(fileName);
        fileName = path.toString();
        String parent = String.valueOf(path.getParent());
        fileManager.setNewFile(fileName.substring(0, parent.length()+1) + "encrypt.txt");
        fileManager.fileReader(key);
        System.out.println("*".repeat(45));
        System.out.println("файл зашифрован c ключем: " + key);
        System.out.println("Файл находится по адресу: " + fileManager.getNewFile());
        UserInterface userInterface = new UserInterface();
        userInterface.start();
    }
}
