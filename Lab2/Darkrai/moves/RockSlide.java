package Lab2.Darkrai.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Rock slide.
 */
public class RockSlide extends PhysicalMove {
    /**
     * Instantiates a new Rock slide.
     */
    public RockSlide() {
        super(Type.ROCK, 75d, 90d);
    }

    protected void applyOppEffects(Pokemon p) {
        // Rock Slide deals damage and has a 30% chance of causing the target to flinch.
        p.addEffect((new Effect()).attack(0.0).turns((int) (Math.random() * 4.0 + 1.0)).chance(0.3d));
    }
}
