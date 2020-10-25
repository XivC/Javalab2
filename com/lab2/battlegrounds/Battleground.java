package com.lab2.battlegrounds;

import ru.ifmo.se.pokemon.*;
import com.lab2.customs.pokemons.*;

public class Battleground{

	private Battle battle;
	private Pokemon[] team1;
	private Pokemon[] team2;
	public Battleground(Pokemon[] team1, Pokemon[] team2){
		this.team1 = team1;
		this.team2 = team2;
	}

	public void start(){
		battle = new Battle();
		for(Pokemon p: team1){
			battle.addAlly(p);
		}
		for(Pokemon p: team2){
			battle.addFoe(p);
		}
		
		battle.go();

	}
}
