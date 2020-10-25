package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
public class MudSlap extends SpecialMove {

	public MudSlap(){
		super(Type.GROUND, 20, 100);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.ACCURACY, -1);
	}
	@Override
	public String describe(){
		return "Applying MudSlap";
	}
}