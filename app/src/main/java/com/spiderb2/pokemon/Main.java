package com.spiderb2.pokemon;

import com.spiderb2.pokemon.pokemon.Pikachu;
import com.spiderb2.pokemon.pokemon.Pokemon;
import com.spiderb2.pokemon.pokemon.items.CheriBerry;
import com.spiderb2.pokemon.pokemon.moves.PokemonMove;

public class Main {
    public static void main(String[] args){
        Pokemon pika1 = new Pikachu();
        System.out.println(pika1.getName()+" has "+pika1.getHP()+" HP.");

        Pikachu pika2 = new Pikachu("Sparky");
        System.out.println(pika2.getName()+" has "+pika2.getHP()+" HP.");
        pika2.pika();

        for(PokemonMove move: pika2.getMoves()){
            move.doMove();
        }

        Pikachu.Tail.wag();

        pika2.addItemToBag(new CheriBerry());
    }
}
