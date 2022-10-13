package Lab2.Pokemons.Bellsprout.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Sweet scent.
 */
// https://pokemondb.net/move/sweet-scent
public class SweetScent extends StatusMove {
    /**
     * Instantiates a new Sweet scent.
     */
    public SweetScent() {
        super(Type.NORMAL, 0d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, -1);
    }

    @Override
    protected String describe() {
        return "использует Sweet Scent";
    }
}
