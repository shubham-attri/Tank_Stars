package com.mygdx.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

//This is class which have various states in which, furter states will be inherited from this, this is the parent
//structure of the class

public abstract class States {
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateManager gameStateManager;

    protected abstract void inputhandler();
    protected abstract void updatestate(double timegap);
    protected abstract void renderscreen(SpriteBatch spriteBatch);

    public OrthographicCamera getCamera() {
        return camera;
    }

    public void setCamera(OrthographicCamera camera) {
        this.camera = camera;
    }

    public Vector3 getMouse() {
        return mouse;
    }

    public void setMouse(Vector3 mouse) {
        this.mouse = mouse;
    }

    public GameStateManager getGameStateManager() {
        return gameStateManager;
    }

    public void setGameStateManager(GameStateManager gameStateManager) {
        this.gameStateManager = gameStateManager;
    }

    protected States(GameStateManager gamestatemanager){
        this.gameStateManager = gamestatemanager;
        mouse = new Vector3();
        camera = new OrthographicCamera();
    }

    protected void render(SpriteBatch spriteBatch){}

}
