package utilij.fileutils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    private String content;
    private String fileName;

    public FileCreator(String content, String fileName) {
        this.content = content;
        this.fileName = fileName;
    }
    public void generateFile() {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
