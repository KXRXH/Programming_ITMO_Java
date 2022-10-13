package Lab2.Pokemons.Bellsprout.Weepinbell.Victreebel.Moves;

import ru.ifmo.se.pokemon.*;

/**
 * The type Swagger.
 */
// https://pokemondb.net/move/swagger
public class Swagger extends StatusMove {
    /**
     * Instantiates a new Swagger.
     */
    public Swagger() {
        super(Type.NORMAL, 0d, 85d);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
        pokemon.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
