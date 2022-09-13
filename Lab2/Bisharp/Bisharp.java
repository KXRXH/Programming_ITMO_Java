package Lab2.Bisharp;

import Lab2.Pawniard.Pawniard;
import ru.ifmo.se.pokemon.Type;

public class Bisharp extends Pawniard {
    public Bisharp(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.DARK, Type.STEEL);
    }
}
