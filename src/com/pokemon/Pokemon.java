package com.pokemon;

public class Pokemon {

    private String name, type;
    private int health;

    private static int totalPokemon = 0;


    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        totalPokemon++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static int getTotalPokemon() {
        return totalPokemon;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }
}
