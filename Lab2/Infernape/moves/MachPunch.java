package Lab2.Infernape.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Mach punch.
 */
public class MachPunch extends PhysicalMove {
    /**
     * Instantiates a new Mach punch.
     */
    public MachPunch() {
        super(Type.FIGHTING, 40d, 100d);
    }

    public String describe() {
        return "использует физическую атаку Mach Punch";
    }

}
