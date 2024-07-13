package com.spiderb2.pokemon.pokemon;

import com.spiderb2.pokemon.pokemon.moves.PokemonMove;

public interface Pokemon {
    String getName();
    int getWeight();
    int getHeight();
    int getHP();
    PokemonType getType();
    PokemonMove[] getMoves();
}
