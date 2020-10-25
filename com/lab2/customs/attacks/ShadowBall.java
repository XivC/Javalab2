package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove{

	public ShadowBall(){

	super(Type.GHOST, 80, 100);
	
	}
	@Override 
	protected void applyOppEffects(Pokemon p){
		p.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, (int)p.getStat(Stat.SPECIAL_DEFENSE) - 1));
	}
	@Override
	protected String describe(){
		return "Applying ShadowBall";
	}

}