package com.lab2.customs.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class StoneEdge extends PhysicalMove {

	public StoneEdge(){
		super(Type.ROCK, 100, 80);
	}

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
		return "Applying StoneEdge";
	}
}
