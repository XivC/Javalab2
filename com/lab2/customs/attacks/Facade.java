package com.lab2.customs.attacks;

import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {

	 public Facade(){
		super(Type.NORMAL, 70, 100);

	}
	@Override 
	protected void applySelfEffects(Pokemon p){

		Status status = p.getCondition();
		
		if (status == Status.BURN || status == Status.POISON || status == Status.PARALYZE) p.setMod(Stat.ATTACK,2); 
	}
	@Override
	public String describe(){
		return "Applying Facade";
	}

}