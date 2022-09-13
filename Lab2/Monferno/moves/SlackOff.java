package Lab2.Monferno.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public class SlackOff extends StatusMove {
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, Stat);
    }
}
