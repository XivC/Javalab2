package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Togepi extends Pokemon {



	public Togepi(java.lang.String name, int level){
		super(name, level);
		setStats(35, 20, 65, 40, 65, 20);
		setType(Type.FAIRY);
		setMove(new WorkUp(), new DreamEater());

	}
}