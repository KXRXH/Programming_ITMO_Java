package Lab2.Darkrai.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80d, 100d);
    }

    protected void applySelfEffects(Pokemon p) {
        // Shadow Ball deals damage and has a 20% chance of lowering the target's Special Defense by one stage.
        p.addEffect(new Effect().chance(0.2d).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}
