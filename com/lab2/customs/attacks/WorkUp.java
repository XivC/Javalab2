package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class WorkUp extends StatusMove {

	public WorkUp(){
		super(Type.NORMAL, 0, 100);
	}

	protected void applySelfEffect(Pokemon p){
		p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, (int)p.getStat(Stat.SPECIAL_ATTACK) + 1));
		p.addEffect(new Effect().stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK) + 1));
	}


	@Override
	protected String describe(){
		return "Applying WorkUp";
	}
}
