package Lab2.Pokemons.Nosepass.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/move/dazzling-gleam
public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80d, 100d);
    }

    @Override
    protected String describe() {
        return "использует DazzlingGleam";
    }
}
