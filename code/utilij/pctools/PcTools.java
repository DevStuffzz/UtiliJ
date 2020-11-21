package utilij.pctools;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PcTools {
    public static String stringToBinary(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar)).replaceAll(" ", "0")                         // zero pads
            );
        }
        return prettyBinary(result.toString(), 6, " ");
    }
    public static String prettyBinary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }
}
