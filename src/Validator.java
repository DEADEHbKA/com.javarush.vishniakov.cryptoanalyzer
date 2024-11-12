import java.io.File;

public class Validator {

    public Validator() {}

    public static boolean validKey(String tmpKey) {
        try {
           Integer.parseInt(tmpKey);
           return true;
        }catch (NumberFormatException e){
            System.out.println("Введите правильное значение ");
            return false;
        }
    }
    public static boolean validFile(String filename){
        try {
            File file = new File(filename);
            if(file.exists()) {
                return true;
            }else {
                System.out.println("Такой файл не существует");
                return false;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Вы ввели не верный формат пути к файлу");
            return false;
        }
    }
}
