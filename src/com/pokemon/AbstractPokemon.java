package com.pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {

    ArrayList<Pokemon> myPokemons = new ArrayList<>();

    @Override
    public Pokemon createPokemon(String name, String type, int health) {
        Pokemon newPokemon = new Pokemon(name,type,health);
        myPokemons.add(newPokemon);
        return newPokemon;
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "Name:\t" + pokemon.getName() +
                "\nHealth:\t" + pokemon.getHealth() +
                "\nType:\t" + pokemon.getType();
    }

}
