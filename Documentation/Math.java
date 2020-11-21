
import utilij.math.Vector2f;

import static utilij.math.UtiliJMath.*;

public class UtiliJDocumentation {
    public static void main(String[] args)  {
        // With UtiliJ you can find the midpoint between two Vector2f's
        // I mainly added it because I was struggling with midpoints when I was in Geometry
        Vector2f a = new Vector2f(1.0f, 2.0f);
        Vector2f b = new Vector2f(2.0f, 1.0f);

        // Now we can find the midpoint
        Vector2f midpoint = getMidpoint(a, b);

        // with UtiliJ you can also sort integer arrays
        int[] unsorted = {1, 5, 6, 3, 4};
        sort(unsorted);
        // You will now get {1, 3, 4, 5, 6}

        // You can also find out if an integer is a prime number
        if(!prime(6)) {
            // Because 6 is a prime number, this will run
        }

        // And lastly you can get the factorial of an integer
        int factor = factorial(5);
        // factor would be 120
    }
}
