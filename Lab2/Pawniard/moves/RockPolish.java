package Lab2.Pawniard.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

/**
 * The type Rock polish.
 */
public class RockPolish extends StatusMove {
    protected void applySelfEffects(Pokemon pokemon) {
        // https://pokemondb.net/move/rock-polish
        pokemon.addEffect(new Effect().stat(Stat.SPEED, 2));
    }

    public String describe() {
        return "использует Rock Polish (получает прибавку к скорости +2)";
    }
}
