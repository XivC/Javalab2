package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Togekiss extends Togetic {



	public Togekiss(java.lang.String name, int level){
		super(name, level);
		setStats(85, 50, 95, 120, 115, 80);
		setType(Type.FAIRY, Type.FLYING);
		setMove(new WorkUp(), new DreamEater(), new Growl(), new Swagger());

	}
}