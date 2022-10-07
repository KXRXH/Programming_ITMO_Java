package Lab2.Pokemons.Bellsprout.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0d, 100d);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect sleepEffect = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(2);
        pokemon.restore();
        pokemon.addEffect(sleepEffect);
    }
}
