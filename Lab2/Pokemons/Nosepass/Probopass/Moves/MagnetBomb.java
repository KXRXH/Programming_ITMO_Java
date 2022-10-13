package Lab2.Pokemons.Nosepass.Probopass.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Magnet bomb.
 */
// https://pokemondb.net/move/magnet-bomb
public class MagnetBomb extends PhysicalMove {
    /**
     * Instantiates a new Magnet bomb.
     */
    public MagnetBomb() {
        super(Type.STEEL, 60d, 100d);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        // INF accuracy. Magnet Bomb deals damage and ignores changes to the Accuracy and Evasion stats
        return true;
    }

    @Override
    protected String describe() {
        return "использует Magnet Bomb";
    }
}
