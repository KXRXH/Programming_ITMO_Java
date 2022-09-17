package Lab2.Darkrai;

import Lab2.Darkrai.moves.CalmMind;
import Lab2.Darkrai.moves.DreamEater;
import Lab2.Darkrai.moves.RockSlide;
import Lab2.Darkrai.moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Darkrai.
 */
public class Darkrai extends Pokemon {
    /**
     * Instantiates a new Darkrai.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Darkrai(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.DARK);
        this.setStats(70d, 90d, 90d, 135d, 90d, 125d);
        this.addMove(new CalmMind());
        this.addMove(new RockSlide());
        this.addMove(new ShadowBall());
        this.addMove(new DreamEater());
    }
}
