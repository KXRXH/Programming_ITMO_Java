package Lab2;

import Lab2.Pokemons.Bellsprout.Bellsprout;
import Lab2.Pokemons.Bellsprout.Weepinbell.Victreebel.Victreebel;
import Lab2.Pokemons.Bellsprout.Weepinbell.Weepinbell;
import Lab2.Pokemons.Dunsparce.Dunsparce;
import Lab2.Pokemons.Nosepass.Nosepass;
import Lab2.Pokemons.Nosepass.Probopass.Probopass;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

/**
 * The type Lab 2.
 */
public class Lab2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String... args) {
        Battle b = new Battle();
        // First Pokémon team
        int PokemonLevels = 50;
        Pokemon[] firstTeam = {new Nosepass("Nosepass", PokemonLevels),
                new Probopass("Probopass", PokemonLevels), new Dunsparce("Dunsparce", PokemonLevels)};
        // Second Pokémon team
        Pokemon[] secondTeam = {new Bellsprout("Bellsprout", PokemonLevels),
                new Weepinbell("Weepinbell", PokemonLevels), new Victreebel("Victreebel", PokemonLevels)};
        // Adding Pokémons from first team to the battle
        for (Pokemon p : firstTeam) {
            b.addFoe(p);
        }
        // Adding Pokémons from second team to the battle
        for (Pokemon p : secondTeam) {
            b.addAlly(p);
        }
        // Running the battle
        b.go();
    }
}
