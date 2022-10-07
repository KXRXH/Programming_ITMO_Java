package Lab2.Pokemons.Nosepass.Probopass.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/move/magnet-bomb
public class MagnetBomb extends PhysicalMove {
    public MagnetBomb() {
        super(Type.STEEL, 60d, 100d);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        // INF accuracy. Magnet Bomb deals damage and ignores changes to the Accuracy and Evasion stats
        return true;
    }

}
