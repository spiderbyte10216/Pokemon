package com.spiderb2.pokemon.pokemon.moves;

import com.spiderb2.pokemon.pokemon.PokemonType;

public abstract class PokemonMove {
    protected PokemonType type;
    public PokemonType getType(){
        return type;
    }
    public abstract void doMove();
}
