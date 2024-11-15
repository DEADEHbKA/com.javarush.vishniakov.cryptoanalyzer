import java.io.*;

public class FileManager {
    private  String newFile;
    private  String fileName;

    public FileManager() {}

    public String getNewFile() {
        return newFile;
    }

    public void setNewFile(String newFile) {
        this.newFile = newFile;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void fileReader (int key) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
           while (bufferedReader.ready()){
              fileWriter(Cypher.cypher(bufferedReader.readLine(), key));
           }
        } catch (Exception e) {    // обработать эксепшны
            throw new RuntimeException(e);
        }
    }

    public void fileWriter(String outString){
        try(BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(newFile, true))){
            bufferedWriter.write(outString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

