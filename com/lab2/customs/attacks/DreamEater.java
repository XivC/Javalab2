package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class DreamEater extends SpecialMove {

	public DreamEater(){
		super(Type.PSYCHIC, 100, 100);
	}
	@Override
	protected double calcBaseDamage(Pokemon att, Pokemon def){
		Status status = def.getCondition();
		if(status == Status.SLEEP) {
			return att.getStat(Stat.SPECIAL_ATTACK);
		}
		else {
			return 0.0;
		}
	}
	@Override
	protected void applySelfEffects(Pokemon p){

		p.addEffect(new Effect().stat(Stat.HP, (int)(p.getHP() + p.getHP()*0.5)));
	}


	@Override
	protected String describe(){
		return "Applying DreamEater";
	}
}
