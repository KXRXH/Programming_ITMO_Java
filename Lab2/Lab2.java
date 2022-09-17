package Lab2;

import Lab2.Darkrai.Darkrai;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

/**
 * The type Lab 2.
 */
public class Lab2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon pt = new Pokemon("Тестовый чел", 5);
        Darkrai d1 = new Darkrai("Даркраи", 1);
        System.out.println(d1.getHP());
        b.addAlly(d1);
        b.addFoe(pt);
        b.go();
    }
}
