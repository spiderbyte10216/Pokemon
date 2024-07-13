package com.spiderb2.pokemon.pokemon;

import com.spiderb2.pokemon.pokemon.moves.Growl;
import com.spiderb2.pokemon.pokemon.moves.PokemonMove;
import com.spiderb2.pokemon.pokemon.moves.TailWhip;
import com.spiderb2.pokemon.pokemon.moves.ThunderWave;
import com.spiderb2.pokemon.pokemon.moves.Thundershock;

public class Pikachu implements Pokemon {

    private String name;
    private int weight;
    private int height;
    private int hp;
    private final PokemonType type = PokemonType.ELECTRIC;
    private PokemonMove[] moves;

    private void reset(){
        this.weight = 16;
        this.height = 13;
        this.hp = 35;
        this.moves = new PokemonMove[]{
                new Thundershock(),
                new Growl(),
                new TailWhip(),
                new ThunderWave()
        };
    }

    public Pikachu() {
        this.name = "Pikachu";
        reset();
    }

    public Pikachu(String name){
        this.name = name;
        reset();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public PokemonType getType() {
        return this.type;
    }

    @Override
    public PokemonMove[] getMoves() {
        return this.moves;
    }
}
