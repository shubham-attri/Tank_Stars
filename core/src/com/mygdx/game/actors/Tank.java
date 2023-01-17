package com.mygdx.game.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import java.util.Iterator;

public abstract class Tank {
    public Vector3 postion;
    public double angle;
    public Texture tank;
    public double health;
    public double power;
    public String name;

    public static Iterator<Tank> iterator() {
        return null;
    }

    public Vector3 getPostion() {
        return postion;
    }

    public void setPostion(Vector3 postion) {
        this.postion = postion;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Texture getTank() {
        return tank;
    }

    public void setTank(Texture tank) {
        this.tank = tank;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tank(Vector3 postion, double angle, Texture tank, double health, double power, String name) {
        this.postion = postion;
        this.angle = angle;
        this.tank = tank;
        this.health = health;
        this.power = power;
        this.name = name;
    }

    public boolean checkfuelvalidstate(int intifuel){
        if(intifuel <0){
            return false;
        }
        return true;
    }

    public int reducefuel(int fuelinitial,int movement, int time){
        checkfuelvalidstate(fuelinitial);
        fuelinitial = movement+time;
        return fuelinitial;

    }

    public void movefront(double value){};
    public void moveback(double value){};
    public void fire(){};
    public void aimup(){};
    public void aimdown(){};
    public void reducefuel(){};
    public void shoot(){};

}
