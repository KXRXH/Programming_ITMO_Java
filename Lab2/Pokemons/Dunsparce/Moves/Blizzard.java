package Lab2.Pokemons.Dunsparce.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/move/blizzard
public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110d, 70d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ICE)) {
            Effect freezeEffect = (new Effect()).condition(Status.FREEZE).attack(0.0).turns(-1).chance(0.1);
            pokemon.addEffect(freezeEffect);
        }
    }

    @Override
    protected String describe() {
        return "использует Blizzard";
    }
}
