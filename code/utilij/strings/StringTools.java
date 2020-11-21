package utilij.strings;

import jdk.jfr.Label;

public class StringTools {
    public static String flip(String s) {
        char[] in = s.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
    public static boolean palindrome(String pal) {
        if(pal.equals(flip(pal))) {
            return true;
        }
        return false;
    }
    public static String[] wordsInString(String s) {
        String[] sArray = s.split(" ");
        return sArray;
    }

    public static String IntToEnglish(int n) {
        final String[] NUMS = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};
        final String[] TENS2 = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty",
                "seventy", "eighty", "ninety"};
        final String[] TENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String ret = "";
        if (n == 0) {
            return NUMS[0];
        }
        if (n >= 100) {
            ret += NUMS[n/100] + " hundred";
            n = n%100;
            if (n != 0) {
                ret += " ";
            }
        }
        if (n >= 20) {
            ret += TENS2[n/10];
            n = n%10;
            if (n != 0) {
                ret += " ";
            }
        } else if (n >= 10) {
            ret += TENS[n%10];
            n = 0;
        }
        if (n > 0) {
            ret += NUMS[n];
        }
        return ret;
    }
}
