package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));
        pokemons.add(new Pokemon(13, "Gastly", R.drawable.gastly_ghost_poison, "Poison"));
        pokemons.add(new Pokemon(14, "Gengar", R.drawable.gengar_ghost_poison, "Poison"));
        pokemons.add(new Pokemon(15, "Geodude", R.drawable.geodude_rock_ground, "Rock"));
        pokemons.add(new Pokemon(16, "Gulpin", R.drawable.gulpinp_poison, "Poison"));
        pokemons.add(new Pokemon(17, "Magnemite", R.drawable.magnemite_eletric_steel, "Electric"));
        pokemons.add(new Pokemon(18, "Minun", R.drawable.minun_electric, "Electric"));
        pokemons.add(new Pokemon(19, "Plusle", R.drawable.plusle_electric, "Electric"));
        pokemons.add(new Pokemon(20, "Poliwag", R.drawable.poliwag_water, "Water"));
        pokemons.add(new Pokemon(21, "Psyduck", R.drawable.psyduck_water, "Water"));
        pokemons.add(new Pokemon(22, "Swalot", R.drawable.swalot_poison, "Poison"));
        pokemons.add(new Pokemon(23, "Tentacool", R.drawable.tentacool_water_poison, "Water"));
        pokemons.add(new Pokemon(24, "Wailmer", R.drawable.wailmer_water, "Water"));
        pokemons.add(new Pokemon(25, "Jigglypuff", R.drawable.jigglypuff_fairy, "Normal"));
        pokemons.add(new Pokemon(26, "Tangela", R.drawable.tangela_grass, "Grass"));
        pokemons.add(new Pokemon(27, "Haunter", R.drawable.haunter_gass, "Gass"));
        pokemons.add(new Pokemon(28, "Abra", R.drawable.abra_psychic, "Psychic"));
        pokemons.add(new Pokemon(29, "Koffing", R.drawable.koffing_gass, "Gass"));



        return pokemons;
    }
}
