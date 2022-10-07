package Lab2;

import Lab2.Pokemons.Nosepass.Probopass.Probopass;
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
        Pokemon pt = new Pokemon("Тестовый чел", 10);
        Pokemon prb = new Probopass("Kрутой чел", 1);
        b.addFoe(pt);
        b.addAlly(prb);
        b.go();
    }
}
