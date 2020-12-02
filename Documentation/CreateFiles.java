import utilij.fileutils.FileCreator;

public class UtiliJDocumentation {
    
    // You take any String, this will be the content of your file
    public static final String content = "public class Main {\n" +
            "public static void main(String[] args) {\n" +
            "   System.out.println('H');\n" +
            "   }\n" +
            "}\n";
    
    
    public static void main(String[] args) {
        // This will create an object that stores your file information
        FileCreator fc = new FileCreator(content, "test.java");
        
        // Creates a file with the name you gave it
        fc.generateFile();
        
        // Writes the content to the file
        fc.writeToFile();
    }
}
