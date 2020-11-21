import static utilij.strings.StringTools.*;

public class UtiliJDocumentation {
    public static void main(String[] args)  {
        // With UtiliJ you can do a lot of useful things with strings

        // You can finally flip a string
        String flip = flip("HI");
        // flip = "IH"

        // You can tell if your string is a palindrome
        boolean palindrome = palindrome("racecar");
        // Because the word "Racecar" is a palindrome, the boolean is true

        // You can split a sentance into an array of words
        String sentance = "The Cow Jumped Over the Moon";

        String[] words = wordsInString(sentance);
        
        // words would now be {"The", "Cow", "Jumped", "Over", "the", "Moon"}


        // you can take an integer up to 999 and put it into an english word
        int num = 234;
        String numToString = IntToEnglish(num);

        // numToString is now "two hundred thirty four"
    }
}
