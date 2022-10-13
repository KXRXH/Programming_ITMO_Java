package Lab2.Pokemons.Bellsprout;

import Lab2.Pokemons.Bellsprout.Moves.Rest;
import Lab2.Pokemons.Bellsprout.Moves.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Bellsprout.
 */
public class Bellsprout extends Pokemon {
    /**
     * Instantiates a new Bellsprout.
     *
     * @param name the name
     * @param lvl  the lvl
     */
    public Bellsprout(String name, int lvl) {
        super(name, lvl);
        setStats(50d, 75d, 35d, 70d, 30d, 40d);
        setType(Type.GRASS, Type.POISON);
        addMove(new Rest());
        addMove(new SweetScent());
    }
}
