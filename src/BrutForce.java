import java.nio.file.Path;
import java.nio.file.Paths;

public class BrutForce {

    public void brutForce(String fileName){
        FileManager fileManager = new FileManager();
        for (int i = 0; i < Alphabet.getLengthAlphabet(); i++) {
            Path path = Paths.get(fileName);
            fileName = path.toString();
            String parent = String.valueOf(path.getParent());
            fileManager.setNewFile(fileName.substring(0, parent.length()+1) + "Var" + i + ".txt");
            fileManager.setFileName(fileName);
            System.out.println(fileManager.getNewFile());
            fileManager.fileReader(-i);
        }
    }
}
