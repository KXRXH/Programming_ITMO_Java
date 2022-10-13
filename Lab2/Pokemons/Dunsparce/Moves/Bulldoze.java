package Lab2.Pokemons.Dunsparce.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Bulldoze.
 */
// https://pokemondb.net/move/bulldoze
public class Bulldoze extends PhysicalMove {
    /**
     * Instantiates a new Bulldoze.
     */
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Bulldoze";
    }
}
