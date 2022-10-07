package Lab2.Pokemons.Bellsprout;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int lvl) {
        super(name, lvl);
        setStats(50d, 75d, 35d, 70d, 30d, 40d);
        setType(Type.GRASS, Type.POISON);
    }
}
