package Cs.Lab1;

public class Lab1 {
    public static void main(String[] args) {
        String n = null;
        try {
            n = Converter.anyToAnyInt("77777777777777777", 8, 24);
        } catch (Converter.BadInput e) {
            System.out.println(e.getMessage());
        }
        System.out.println(n == null ? "nil" : n);
    }
}