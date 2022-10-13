package Lab2.Pokemons.Bellsprout.Moves;

import Lab2.Effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


/**
 * The type Rest.
 */
// https://pokemondb.net/move/rest
public class Rest extends StatusMove {
    /**
     * Instantiates a new Rest.
     */
    public Rest() {
        super(Type.PSYCHIC, 0d, 100d);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        // Restore HP
        pokemon.setMod(Stat.HP, (int) (pokemon.getStat(Stat.HP) - pokemon.getHP()));
        // Sleep for 2 turns
        MyEffects.sleep(pokemon, 2);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
