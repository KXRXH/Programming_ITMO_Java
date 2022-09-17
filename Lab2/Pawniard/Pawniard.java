package Lab2.Pawniard;

import Lab2.Pawniard.moves.Leer;
import Lab2.Pawniard.moves.NightSlash;
import Lab2.Pawniard.moves.RockPolish;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Pawniard.
 */
public class Pawniard extends Pokemon {
    /**
     * Instantiates a new Pawniard.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Pawniard(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.DARK, Type.STEEL);
        this.addMove(new RockPolish());
        this.addMove(new Leer());
        this.addMove(new NightSlash());
    }
}
