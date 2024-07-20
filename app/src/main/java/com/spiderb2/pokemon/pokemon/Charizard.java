package com.spiderb2.pokemon.pokemon;

import com.spiderb2.pokemon.pokemon.items.Item;
import com.spiderb2.pokemon.pokemon.moves.Growl;
import com.spiderb2.pokemon.pokemon.moves.PokemonMove;
import com.spiderb2.pokemon.pokemon.moves.TailWhip;
import com.spiderb2.pokemon.pokemon.moves.ThunderWave;
import com.spiderb2.pokemon.pokemon.moves.Thundershock;

import java.util.ArrayList;
import java.util.List;

public class Charizard implements Pokemon {

    private String name;
    private int weight;
    private int height;
    private int hp;
    private final PokemonType type = PokemonType.FIRE;
    private PokemonMove[] moves;
    List<Item> bag;
    private void reset(String name){
        this.weight = 16;
        this.height = 13;
        this.hp = 35;
        this.moves = new PokemonMove[]{
                new Thundershock(),
                new Growl(),
                new TailWhip(),
                new ThunderWave()
        };
        this.bag = new ArrayList<>();
        this.name = name;

    }
    public Charizard(){
        reset("Charizard");
    }
    public Charizard(String name){
        reset(name);

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public PokemonType getType() {
        return type;
    }

    @Override
    public PokemonMove[] getMoves() {
        return moves;
    }
}
