package Lab2.Darkrai.moves;

import java.awt.event.ItemEvent;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100d, 100d);
    }

    protected void applyOppDamage(Pokemon p) {
        
    }
    protected void applySelfEffects(Pokemon p) {
        // p.addEffect(new Effect().stat(Stat.HP, ));
    }

    protected String describe() {
        return "использует специальную специальную аттаку Dream Eater";
    }
}
