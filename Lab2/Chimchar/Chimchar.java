package Lab2.Chimchar;

import Lab2.Chimchar.moves.Flamethrower;
import Lab2.Chimchar.moves.FurySwipes;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Chimchar.
 */
public class Chimchar extends Pokemon {
    /**
     * Instantiates a new Chimchar.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Chimchar(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE);
        this.addMove(new FurySwipes());
        this.addMove(new Flamethrower());
    }
}
