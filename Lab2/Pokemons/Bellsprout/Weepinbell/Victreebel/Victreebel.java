package Lab2.Pokemons.Bellsprout.Weepinbell.Victreebel;

import Lab2.Pokemons.Bellsprout.Weepinbell.Victreebel.Moves.Swagger;
import Lab2.Pokemons.Bellsprout.Weepinbell.Weepinbell;

/**
 * The type Victreebel.
 */
public class Victreebel extends Weepinbell {
    /**
     * Instantiates a new Victreebel.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Victreebel(String name, int lvl) {
        super(name, lvl);
        setStats(80d, 105d, 65d, 100d, 70d, 70d);
        addMove(new Swagger());
    }

}
