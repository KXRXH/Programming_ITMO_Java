package Lab2.Pokemons.Nosepass.Moves;

import Lab2.Effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Discharge.
 */
// https://pokemondb.net/move/discharge
public class Discharge extends SpecialMove {
    /**
     * Instantiates a new Discharge.
     */
    public Discharge() {
        super(Type.ELECTRIC, 80d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        MyEffects.paralyze(pokemon, 0.3d);
    }

    @Override
    protected String describe() {
        return "использует Discharge";
    }
}
