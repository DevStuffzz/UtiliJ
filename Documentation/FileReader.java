import utilij.fileutils.FileReader;

import java.io.IOException;
import java.nio.charset.Charset;

public class UtiliJDocumentation {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader();
        
        // It does not have to be a text file, you can do any text-based file
        // So any code you have, you can load
        // Really usefull for loading GLSL Shaders
        // YOUR METHOD NEEDS TO THROW IOEXCEPTION
        String file = reader.LoadFileAsString("src/test.txt", Charset.defaultCharset());
        
        // Your entire file is now formatted correctly so you can do what you please with it
    }
}
