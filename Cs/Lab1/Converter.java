package Cs.Lab1;

/**
 * The type Cs.Lab1.Converter.
 */
public class Converter {
    /**
     * The error type Bad input.
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

    private final static String charSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String stringNumPattern = "^[0-9,A-Z]+$";
    private final static short MIN_NUMBER_SYSTEM = 2;
    private final static short MAX_NUMBER_SYSTEM = 36; // equals to the length of charSet


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
        if (origin < MIN_NUMBER_SYSTEM || target < MIN_NUMBER_SYSTEM ||
                origin > MAX_NUMBER_SYSTEM || target > MAX_NUMBER_SYSTEM) {
            throw new BadInput("Invalid number system: MIN=2, MAX=36.");
        }
        // Getting regex pattern for input number system.
        String numCheckPattern;
        if (origin <= 10) {
            // is number has only allowed digits.
            numCheckPattern = String.format("^[0-%d]+$", origin - 1);
        } else {
            // is number has only digits and chars.
            numCheckPattern = String.format("^[0-9,A-%s]+$", charSet.charAt(origin - 1));
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
                decimalNumberBuff += (int) Math.pow(origin, power) * charSet.indexOf(num.charAt(i));
            }
        }
        // converting to the target number system
        if (decimalNumberBuff == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (decimalNumberBuff != 0) {
            result.insert(0, charSet.charAt(decimalNumberBuff % target));
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
