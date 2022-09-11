package Lab2.Darkrai.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75d, 90d);
    }

    protected void applyOppEffects(Pokemon p) {
        // Rock Slide deals damage and has a 30% chance of causing the target to flinch.
        Effect.flinch(p);
    }

}
