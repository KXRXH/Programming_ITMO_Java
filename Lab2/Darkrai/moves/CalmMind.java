package Lab2.Darkrai.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Calm mind.
 */
public class CalmMind extends StatusMove {
    /**
     * Instantiates a new Calm mind.
     */
    public CalmMind() {
        super(Type.PSYCHIC, 0d, 0d);
    }

    protected void applySelfEffects(Pokemon p) {
        // https://pokemondb.net/move/calm-mind
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1));
    }
}
