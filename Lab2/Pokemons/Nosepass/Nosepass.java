package Lab2.Pokemons.Nosepass;

import Lab2.Pokemons.Nosepass.Moves.DazzlingGleam;
import Lab2.Pokemons.Nosepass.Moves.Discharge;
import Lab2.Pokemons.Nosepass.Moves.EarthPower;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Nosepass.
 */
public class Nosepass extends Pokemon {
    /**
     * Instantiates a new Nosepass.
     *
     * @param name the name
     * @param lvl  the lvl
     */
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
