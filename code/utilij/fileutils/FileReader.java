package utilij.fileutils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    private String resorceToLoad;

    public String LoadFileAsString(String file, Charset encoding) throws IOException {
            byte[] encoded = Files.readAllBytes(Paths.get(file));
            return new String(encoded, encoding);
    }

    public byte[] LoadFileAsByteArray(String file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(file));
        return encoded;
    }
}
