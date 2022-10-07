package Lab2.Pokemons.Dunsparce;

import Lab2.Pokemons.Dunsparce.moves.Blizzard;
import Lab2.Pokemons.Dunsparce.moves.Bulldoze;
import Lab2.Pokemons.Dunsparce.moves.DoubleTeam;
import Lab2.Pokemons.Dunsparce.moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

// https://pokemondb.net/pokedex/dunsparce
public class Dunsparce extends Pokemon {
    public Dunsparce(String name, int lvl) {
        super(name, lvl);
        // HP, Attack, Defense, Sp. Atk, Sp. Def, Speed
        setStats(100d, 70d, 70d, 65d, 65d, 45);
        setType(Type.NORMAL);
        addMove(new Blizzard());
        addMove(new DoubleTeam());
        addMove(new Bulldoze());
        addMove(new Thunderbolt());
    }
}
