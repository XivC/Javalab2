package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Togetic extends Togepi {



	public Togetic(java.lang.String name, int level){
		super(name, level);
		setStats(55, 40, 85, 80, 105, 40);
		setType(Type.FAIRY, Type.FLYING);
		setMove(new WorkUp(), new DreamEater(), new Growl());

	}
}