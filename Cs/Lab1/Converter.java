package Cs.Lab1;

/**
 * The type Cs.Lab1.Converter.
 */
public class Converter {
    /**
     * Converter's error class.
     */
    static class BadInput extends Exception {
        /**
         * Instantiates a new Bad input.
         *
         * @param errorMessage the error message
         */
        public BadInput(String errorMessage) {
            super(errorMessage);
        }
    }

    private final static String CharSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String stringNumPattern = "^[0-9,A-Z]+$";
    private final static short MinNumberSystem = 2;
    private final static short MaxNumberSystem = 36; // equals to the length of "CharSet"


    /**
     * Any to any int string.
     *
     * @param num    string number representation
     * @param origin origin number system
     * @param target target number system
     * @return converted number as string
     * @throws BadInput throw exception if number or number systems formats are not correct
     */
    public static String anyToAnyInt(String num, int origin, int target) throws BadInput {
        // is number has correct format
        num = num.toUpperCase();
        if (isNotMatch(num, stringNumPattern)) {
            throw new BadInput("Invalid number: number has invalid chars " + num);
        }
        // is number systems are correct (value must be between 2 and 36)
        if (origin < MinNumberSystem || target < MinNumberSystem ||
                origin > MaxNumberSystem || target > MaxNumberSystem) {
            throw new BadInput("Invalid number system: MIN=2, MAX=36.");
        }
        // Getting regex pattern for input number system.
        String numCheckPattern;
        if (origin <= 10) {
            // is number has only allowed digits.
            numCheckPattern = String.format("^[0-%d]+$", origin - 1);
        } else {
            // is number has only digits and chars.
            numCheckPattern = String.format("^[0-9,A-%s]+$", CharSet.charAt(origin - 1));
        }
        if (isNotMatch(num, numCheckPattern)) {
            throw new BadInput("Invalid number: number isn't in " + origin + " number system.");
        }
        // converting the number target a decimal number if it is not already a decimal number.
        int decimalNumberBuff;
        if (origin == 10) {
            decimalNumberBuff = Integer.parseInt(num);
        } else {
            int power = num.length() - 1;
            decimalNumberBuff = 0;
            for (int i = 0; i < num.length(); i++) {
                decimalNumberBuff += (int) Math.pow(origin, power) * CharSet.indexOf(num.charAt(i));
            }
        }
        // converting to the target number system
        if (decimalNumberBuff == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (decimalNumberBuff != 0) {
            result.insert(0, CharSet.charAt(decimalNumberBuff % target));
            decimalNumberBuff /= target;
        }
        return result.toString();
    }


    /**
     * @param str       str number representation
     * @param regexExpr regex expression
     * @return boolean is num matches to regex expression
     */
    private static boolean isNotMatch(String str, String regexExpr) {
        return !str.matches(regexExpr);
    }
}
