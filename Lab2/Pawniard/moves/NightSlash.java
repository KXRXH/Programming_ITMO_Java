package Lab2.Pawniard.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Night slash.
 */
public class NightSlash extends PhysicalMove {
    /**
     * Instantiates a new Night slash.
     */
    public NightSlash() {
        super(Type.DARK, 70d, 100d);
    }

    public String describe() {
        return "использует физическую атаку Night Slash";
    }
}
