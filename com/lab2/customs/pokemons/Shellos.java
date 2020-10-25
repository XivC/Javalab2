package com.lab2.customs.pokemons;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.attacks.*;
public class Shellos extends Pokemon {



	public Shellos(java.lang.String name, int level){
		super(name, level);
		setStats(76, 48, 48, 57, 62, 34);
		setType(Type.WATER);
		setMove(new MudSlap(), new Facade(), new Rest());

	}
}