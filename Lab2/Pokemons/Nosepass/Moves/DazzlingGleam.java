package Lab2.Pokemons.Nosepass.Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Dazzling gleam.
 */
// https://pokemondb.net/move/dazzling-gleam
public class DazzlingGleam extends SpecialMove {
    /**
     * Instantiates a new Dazzling gleam.
     */
    public DazzlingGleam() {
        super(Type.FAIRY, 80d, 100d);
    }

    @Override
    protected String describe() {
        return "использует Dazzling Gleam";
    }
}
