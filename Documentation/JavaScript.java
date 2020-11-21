import utilij.otherlanguages.JavaScriptFile;

import java.io.IOException;

public class UtiliJDocumentation {
    public static void main(String[] args) throws IOException {
        // The biggest takeaway from UtiliJ is the abilty to run JS code from a Java file
        // MUST THROW AN IOEXCEPTION ON YOUR METHOD

        // You start by making a JavaScriptFile
        JavaScriptFile jsFile;

        // You instantiate it with a link to the code
        jsFile = new JavaScriptFile("src/test.js");

        // You then have to compile it
        jsFile.Compile();

        //now you can run the code
        jsFile.Run();
    }
}
