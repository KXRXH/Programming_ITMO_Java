package Lab2.Pokemons.Nosepass.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Earth power.
 */
// https://pokemondb.net/move/earth-power
public class EarthPower extends SpecialMove {
    /**
     * Instantiates a new Earth power.
     */
    public EarthPower() {
        super(Type.GROUND, 90d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Earth Power";
    }
}
