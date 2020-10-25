package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Gastrogon extends Shellos {



	public Gastrogon(java.lang.String name, int level){
		super(name, level);
		setStats(111, 83, 68, 92, 82, 39);
		setType(Type.WATER, Type.GROUND);
		setMove(new Facade(), new MudSlap(), new Rest(), new StoneEdge());

	}
}