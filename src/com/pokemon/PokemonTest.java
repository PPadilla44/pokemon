package com.pokemon;

public class PokemonTest {

    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();

        Pokemon charmander = pokedex.createPokemon("Charmander", "Fire",150);
        Pokemon squirtle = pokedex.createPokemon("Squirtle", "Water", 120);
        Pokemon bulbasaur = pokedex.createPokemon("Bulbasaur", "Grass", 200);
        Pokemon chimchar = pokedex.createPokemon("Chimchar", "Fire", 125);
        Pokemon treecko = pokedex.createPokemon("Treecko", "Grass", 175);

        System.out.println(pokedex.pokemonInfo(bulbasaur));
        System.out.println(pokedex.pokemonInfo(chimchar));
        System.out.println(pokedex.pokemonInfo(treecko));


        System.out.println("\n-----ATTACKING POKEMON-----\n");
        charmander.attackPokemon(bulbasaur);
        squirtle.attackPokemon(chimchar);
        bulbasaur.attackPokemon(treecko);

        System.out.println(pokedex.pokemonInfo(bulbasaur));
        System.out.println(pokedex.pokemonInfo(chimchar));
        System.out.println(pokedex.pokemonInfo(treecko));

        System.out.println("\n-----LISTING POKEMON-----\n");

        System.out.println("Total pokemons:\t" + Pokemon.getTotalPokemon() + "\n");
        pokedex.listPokemon();
    }


}
