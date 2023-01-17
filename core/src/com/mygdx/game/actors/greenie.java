package com.mygdx.game.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class greenie extends Tank {

    Texture tank = new Texture("Greenie.png");

    greenie(Vector3 position, double angle, Texture tank,double health, double power, String name){
        super(position,0,tank, angle, power, "greenie");

    }
    @Override
    public void movefront(double value){

    }

    public Texture getTank() {
        return tank;
    }

    public void setTank(Texture tank) {
        this.tank = tank;
    }
}
