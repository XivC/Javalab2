package com.lab2.customs.attacks;

import ru.ifmo.se.pokemon.*;
public class Flamethrower extends SpecialMove{
	public Flamethrower(){
		super(Type.FIRE, 90, 100);

	}
	@Override
	protected void applyOppEffects(Pokemon p){

		p.addEffect(new Effect().chance(0.1).turns(-1).condition(Status.BURN));

	}
	@Override
	protected String describe(){
		return "Applying Flamethrower";
	}
	
}