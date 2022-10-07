package Lab2.effects;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class MyEffects {
    /**
     * Makes target Pokémon paralyzed (Pokemon's type != Electric)
     *
     * @param pokemon target pokemon
     * @param chance  chance for the effect
     */
    public static void paralyze(Pokemon pokemon, double chance) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect paralyzeEffect = (new Effect()).condition(Status.PARALYZE).attack(0.75).turns(-1)
                    .stat(Stat.SPEED, -2).chance(chance);
            pokemon.addEffect(paralyzeEffect);
        }
    }
}
