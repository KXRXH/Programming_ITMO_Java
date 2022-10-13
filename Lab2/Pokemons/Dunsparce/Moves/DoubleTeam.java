package Lab2.Pokemons.Dunsparce.Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Double team.
 */
// https://pokemondb.net/move/double-team
public class DoubleTeam extends StatusMove {
    /**
     * Instantiates a new Double team.
     */
    public DoubleTeam() {
        super(Type.NORMAL, 0d, 100d);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использует Double Team";
    }
}
