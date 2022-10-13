package Lab2.Effects;

import ru.ifmo.se.pokemon.*;

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

    public static void sleep(Pokemon pokemon, int turns) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect paralyzeEffect = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(turns);
            pokemon.addEffect(paralyzeEffect);
        }
    }

    public static void freeze(Pokemon pokemon, double chance) {
        if (!pokemon.hasType(Type.ICE)) {
            Effect freezeEffect = (new Effect()).condition(Status.FREEZE).attack(0.0).turns(-1).chance(chance);
            pokemon.addEffect(freezeEffect);
        }
    }
}
