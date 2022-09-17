import java.util.Random;

/**
 * The type Lab 1.
 */
public class Lab1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        long[] t = new long[11];
        {
            byte c = 0;
            for (long i = 6; i <= 22; i++) {
                if (i % 2 == 0) {
                    t[c++] = i;
                }
            }
        }
        float[] x = new float[19];
        {
            Random rand = new Random();
            for (int i = 0; i < 19; i++) {
                // Filling array with random float numbers from -14.0 to 8.0
                x[i] = rand.nextFloat(-14f, 8f);
            }
        }
        float[][] d = new float[9][19];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                // Getting value for given t[i].
                d[i][j] = GetValue(t[i], x[j]);
            }
        }
        // Printing answer
        ArrayPrint(d);
    }

    private static void ArrayPrint(float[][] x) {
        System.out.println("{");
        for (var i : x) {
            System.out.print(" {");
            for (var n : i) {
                System.out.printf("%8.3f", n);
            }
            System.out.print("  }\n");
        }
        System.out.println("}");
    }

    private static float GetValue(long tI, float x) {
        // enhanced-switch
        return switch ((int) tI) {
            case 8 -> (float) Math.atan(Math.pow(Math.E, Math.pow(-4 + Math.abs(x), 1.0 / 3))); // arctan(e^√3(−4+|x|))
            case 10, 14, 18, 20 -> (float) Math.cos(Math.tan(Math.pow(x, (x + 1) * 0.5f))); // cos(tan((x)^((x+1)/2))))
            default -> (float) Math.sin(Math.atan(Math.sin(Math.tan(Math.cos(x))))); // sin(arctan(sin(tan(cos(x)))))
        };
    }
}
