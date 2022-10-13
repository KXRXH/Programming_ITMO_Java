package Lab2.Pokemons.Bellsprout.Weepinbell;

import Lab2.Pokemons.Bellsprout.Bellsprout;
import Lab2.Pokemons.Bellsprout.Weepinbell.Moves.Slam;

/**
 * The type Weepinbell.
 */
public class Weepinbell extends Bellsprout {
    /**
     * Instantiates a new Weepinbell.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Weepinbell(String name, int lvl) {
        super(name, lvl);
        setStats(65d, 90d, 50d, 85d, 45d, 55d);
        addMove(new Slam());
    }
}
