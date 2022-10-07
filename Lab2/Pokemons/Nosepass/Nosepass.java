package Lab2.Pokemons.Nosepass;

import Lab2.Pokemons.Nosepass.moves.DazzlingGleam;
import Lab2.Pokemons.Nosepass.moves.Discharge;
import Lab2.Pokemons.Nosepass.moves.EarthPower;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nosepass extends Pokemon {
    public Nosepass(String name, int lvl) {
        super(name, lvl);
        // HP, Attack, Defense, Sp. Atk, Sp. Def, Speed
        setStats(30d, 45d, 135d, 45d, 90d, 30d);
        setType(Type.ROCK);
        setMoves(new Discharge(), new DazzlingGleam(), new EarthPower());
    }

    private void setMoves(Move... moves) {
        for (var move : moves) {
            addMove(move);
        }
    }
}
