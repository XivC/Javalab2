package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Kangaskhan extends Pokemon {



	public Kangaskhan(java.lang.String name, int level){
		super(name, level);
		setStats(105, 95, 80, 40, 80, 90);
		setType(Type.NORMAL);
		setMove(new ShadowBall(), new Flamethrower(), new Confide(), new ShadowClaw());

	}
}