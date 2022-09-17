package Lab2.Bisharp;

import Lab2.Pawniard.Pawniard;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Bisharp.
 */
public class Bisharp extends Pawniard {
    /**
     * Instantiates a new Bisharp.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Bisharp(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.DARK, Type.STEEL);
    }
}
