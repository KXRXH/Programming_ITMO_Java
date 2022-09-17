package Lab2.Bisharp.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Stone edge.
 */
public class StoneEdge extends PhysicalMove {
    /**
     * Instantiates a new Stone edge.
     */
    public StoneEdge() {
        super(Type.ROCK, 100d, 80d);
    }

    public String describe() {
        return "использует физическую атаку Stone Edge";
    }
}
