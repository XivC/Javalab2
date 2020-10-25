package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;


public class Growl extends StatusMove {

	public Growl(){
		super(Type.NORMAL, 0, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){

		p.addEffect(new Effect().stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK) - 1));
	}


	@Override
	protected String describe(){
		return "Applying Growl";
	}
}
