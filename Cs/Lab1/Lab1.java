package Cs.Lab1;

public class Lab1 {
    public static void main(String[] args) {
        String n = null;
        try {
            n = Converter.anyToAnyInt("10a", 13, 16);
        } catch (Converter.BadInput e) {
            System.out.println(e.getMessage());
        }
        System.out.println(n);
    }
}