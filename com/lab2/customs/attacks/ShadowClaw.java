package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class ShadowClaw extends PhysicalMove {

	public ShadowClaw(){
		super(Type.GHOST, 70, 100);
	}

	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (1.0 / 8.0 > Math.random()) {
            return 2.0;
        } 
        else {
            return 1.0;
        }
    }


	@Override
	protected String describe(){
		return "Applying ShadowClaw";
	}
}
