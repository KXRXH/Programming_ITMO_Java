package Lab2.Pawniard;

import Lab2.Pawniard.moves.Leer;
import Lab2.Pawniard.moves.NightSlash;
import Lab2.Pawniard.moves.RockPolish;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pawniard extends Pokemon {
    public Pawniard(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.DARK, Type.STEEL);
        this.addMove(new RockPolish());
        this.addMove(new Leer());
        this.addMove(new NightSlash());
    }
}
