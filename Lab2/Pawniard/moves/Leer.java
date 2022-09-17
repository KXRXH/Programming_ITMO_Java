package Lab2.Pawniard.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

/**
 * The type Leer.
 */
public class Leer extends StatusMove {
    protected void applyOppEffects(Pokemon p) {
        // https://pokemondb.net/move/leer
        p.addEffect(new Effect().stat(Stat.DEFENSE, -1));
    }

    public String describe() {
        return "использует Leer (противник теряет 1 очко защиты)";
    }
}
