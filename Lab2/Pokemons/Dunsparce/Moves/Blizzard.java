package Lab2.Pokemons.Dunsparce.Moves;

import Lab2.Effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * The type Blizzard.
 */
// https://pokemondb.net/move/blizzard
public class Blizzard extends SpecialMove {
    /**
     * Instantiates a new Blizzard.
     */
    public Blizzard() {
        super(Type.ICE, 110d, 70d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        MyEffects.freeze(pokemon, 0.1);
    }

    @Override
    protected String describe() {
        return "использует Blizzard";
    }
}
