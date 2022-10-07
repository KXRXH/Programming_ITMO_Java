package Lab2.Pokemons.Dunsparce.moves;

import Lab2.effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/move/thunderbolt
public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        MyEffects.paralyze(pokemon, 0.1d);
    }

    @Override
    protected String describe() {
        return "использует Thunderbolt";
    }
}
