package Lab2.Pokemons.Nosepass.Probopass;


import Lab2.Pokemons.Nosepass.Nosepass;
import Lab2.Pokemons.Nosepass.Probopass.moves.MagnetBomb;
import ru.ifmo.se.pokemon.Type;

public class Probopass extends Nosepass {
    public Probopass(String name, int lvl) {
        super(name, lvl);
        setStats(60d, 55d, 145d, 75d, 150d, 40d);
        setType(Type.ROCK, Type.STEEL);
        addMove(new MagnetBomb());
    }
}