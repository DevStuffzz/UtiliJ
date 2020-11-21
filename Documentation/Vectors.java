import utilij.math.*;

public class UtiliJDocumentation {
    public static void main(String[] args)  {
        //Many ways of holding Vectors
        Vector2f vec2;
        Vector3f vec3;
        Vector4f vec4;

        // You create the Vectors very similarly to J.O.M.L
        vec2 = new Vector2f(10.0f, 3.4f);
        vec3 = new Vector3f(10.0f, 3.14f, 34.5f);
        vec4 = new Vector4f(1.0f, 3.1f, 3.5f, 36.7f);

        // Many ways of Changing the Vectors
        // You can change one variable directly
        vec2.x = 2.0f;

        // Or change the whole Vector
        vec3.set(2.05f, 54.4f, 1.0f);
    }
}
