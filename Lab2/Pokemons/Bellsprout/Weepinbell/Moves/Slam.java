package Lab2.Pokemons.Bellsprout.Weepinbell.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Slam.
 */
// https://pokemondb.net/move/slam
public class Slam extends PhysicalMove {
    /**
     * Instantiates a new Slam.
     */
    public Slam() {
        super(Type.NORMAL, 80d, 75d);
    }

    @Override
    protected String describe() {
        return "использует Slam";
    }
}
