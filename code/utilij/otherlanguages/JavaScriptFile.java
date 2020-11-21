package utilij.otherlanguages;

import utilij.fileutils.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.IOException;
import java.nio.charset.Charset;

public class JavaScriptFile {
    private String jsFile;
    private String fileLocation;

    public JavaScriptFile(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void Compile() throws IOException {
        FileReader reader = new FileReader();
        this.jsFile = reader.LoadFileAsString(fileLocation, Charset.defaultCharset());
    }

    public Object Run() {
        ScriptEngine s = new ScriptEngineManager().getEngineByName("JS");
        try {
            return s.eval(jsFile);
        } catch (Exception e) {
            String[] o = e.toString().replaceAll(".*\n|[^\\d]", " ").split(" +");
            return "Error at line:" + o[1] + " col:" + o[2];
        }
    }
}
