import java.util.Random;

/**
 * The type Lab 1.
 */
public class Lab1 {
    // Sizes of the arrays
    private static final short tSize = 11;
    private static final short xSize = 19;
    private static final short dSizeM = 9;
    private static final short dSizeN = 19;
    private static final Random rnd = new Random();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Initialization of "t"
        long[] t = new long[tSize];
        byte c = 0;
        for (long i = 6; i <= 22; i++) {
            if (i % 2 == 0) {
                t[c++] = i;
            }
        }
        // Initialization of "x"
        float[] x = new float[xSize];
        for (int i = 0; i < xSize; i++) {
            // Filling array with random float numbers from -14.0 to 8.0
            x[i] = GenerateRandomFloatBetween(-14f, 8f);
        }
        // Initialization of "d"
        float[][] d = new float[dSizeM][dSizeN];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                // Getting value for given t[i].
                d[i][j] = GetValue(t[i], x[j]);
            }
        }
        // Printing answer
        ArrayPrint(d);
    }

    /**
     * Nicely print the given array
     *
     * @param x two-dimensional array
     */
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

    /**
     * @param tValue value of t[i]
     * @param x      value of x[j]
     * @return float value for given t[i]
     */
    private static float GetValue(long tValue, float x) {
        // Using switch case expression
        return switch ((int) tValue) {
            case 8 -> (float) Math.atan(Math.pow(Math.E, Math.pow(-4 + Math.abs(x), 1.0 / 3))); // arctan(e^√3(−4+|x|))
            case 10, 14, 18, 20 -> (float) Math.cos(Math.tan(Math.pow(x, (x + 1) * 0.5f))); // cos(tan((x)^((x+1)/2))))
            default -> (float) Math.sin(Math.atan(Math.sin(Math.tan(Math.cos(x))))); // sin(arctan(sin(tan(cos(x)))))
        };
    }

    /**
     * @param min min value of random number
     * @param max max value of random number
     * @return random number of the type float
     */
    private static float GenerateRandomFloatBetween(float min, float max) {
        return (float) (Math.sin((rnd.nextFloat() * (Math.PI / 2.))) * (max - min) - min);
    }
}
