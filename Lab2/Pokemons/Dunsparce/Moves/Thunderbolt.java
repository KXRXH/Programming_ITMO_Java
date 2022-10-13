package Lab2.Pokemons.Dunsparce.Moves;

import Lab2.Effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Thunderbolt.
 */
// https://pokemondb.net/move/thunderbolt
public class Thunderbolt extends SpecialMove {
    /**
     * Instantiates a new Thunderbolt.
     */
    public Thunderbolt() {
        super(Type.ELECTRIC, 90d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        MyEffects.paralyze(pokemon, 0.1d);
    }

    @Override
    protected String describe() {
        return "использует Thunderbolt";
    }
}
