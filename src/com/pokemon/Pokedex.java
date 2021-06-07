package com.pokemon;

public class Pokedex extends AbstractPokemon{

    @Override
    public void listPokemon() {

        for (Pokemon pokemon : myPokemons) {
            System.out.println(pokemon.getName());
        }

    }

}
