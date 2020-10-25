package com.lab2.customs.attacks;

import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, (int)p.getStat(Stat.SPECIAL_ATTACK) - 1));

	}
	@Override
	protected String describe(){
		return "Applying Confide";
	}

}