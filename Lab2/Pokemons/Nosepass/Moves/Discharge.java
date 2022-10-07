package Lab2.Pokemons.Nosepass.moves;

import Lab2.effects.MyEffects;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/move/discharge
public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80d, 100d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        MyEffects.paralyze(pokemon, 0.3d);
    }

    @Override
    protected String describe() {
        return "использует Discharge";
    }
}
