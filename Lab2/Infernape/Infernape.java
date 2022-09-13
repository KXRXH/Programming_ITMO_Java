package Lab2.Infernape;

import Lab2.Chimchar.moves.Flamethrower;
import Lab2.Chimchar.moves.FurySwipes;
import Lab2.Infernape.moves.MachPunch;
import Lab2.Monferno.Monferno;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Monferno {
    public Infernape(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE, Type.FIGHTING);
        this.addMove(new MachPunch());
        this.addMove(new FurySwipes());
        this.addMove(new Flamethrower());
        this.addMove(new SlackOff());
    }
}
