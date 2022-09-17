package Lab2.Chimchar.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Flamethrower.
 */
public class Flamethrower extends SpecialMove {
    /**
     * Instantiates a new Flamethrower.
     */
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        // Flamethrower deals damage and has a 10% chance of burning the target.
        if (!p.hasType(Type.FIRE)) {
            Effect e = (new Effect()).condition(Status.BURN).turns(-1).chance(0.1d);
            e.stat(Stat.ATTACK, -2).stat(Stat.HP, (int) p.getStat(Stat.HP) / 16);
            p.addEffect(e);
        }
    }

    protected String describe() {
        return "использует специальную аттаку (Flamethrower)";
    }
}
