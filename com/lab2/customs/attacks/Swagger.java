package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;


public class Swagger extends StatusMove {

	public Swagger(){
		super(Type.NORMAL, 0, 85);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){

		p.addEffect(new Effect().stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK) + 2));
	}


	@Override
	protected String describe(){
		return "Applying Swagger";
	}
}
