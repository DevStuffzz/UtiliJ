import static utilij.pctools.PcTools.prettyBinary;
import static utilij.pctools.PcTools.stringToBinary;

public class UtiliJDocumentation {
    public static void main(String[] args) {
        // UtiliJ can also turn a string into binary code
        String sentence = "Hello World!";
        String binarySentence = stringToBinary(sentence);

        // you can also take a simple binary structure "101000111001010101"
        // And make it look pretty
        String nonPrettyBinary = "0111101101101";
        String prettyBinary;
        prettyBinary = prettyBinary(nonPrettyBinary, 6, " ");
        // now it looks like "011110 110110 1"
    }
}
