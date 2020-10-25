package com.lab2;

import ru.ifmo.se.pokemon.*;
import com.lab2.battlegrounds.*;
import com.lab2.customs.pokemons.*;

public class Lab2 {



	public static void main (String args[]){

		Battleground b = new Battleground(
			new Pokemon[] {
				new Shellos("GYM BOSS", 1),
				new Kangaskhan("RICARDO MILOS", 1),
				new Togetic("STEVE", 1),

			}, 
			new Pokemon[] {
				new Togekiss("DUNGEON MASTER", 1),
				new Togepi("SLAVE", 1),
				new Gastrogon("TRUMP", 1)

			} );
		b.start();
		
	}
}
