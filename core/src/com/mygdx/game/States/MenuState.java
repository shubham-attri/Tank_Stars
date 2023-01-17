package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.TankStars;
import org.w3c.dom.Text;

public class MenuState extends States {

    //here we have to make all the buttons to be added in the current state
    private final Texture Menuscreenbg;
    private final Texture playgamebutton;
    private final Texture exitbutton;
    private  Texture loadgamebutton;


    public MenuState (GameStateManager gameStateManager){
        super(gameStateManager);
        Menuscreenbg = new Texture("Menuscreenbg.png");
        playgamebutton = new Texture("playgamebutton.png");
        loadgamebutton = new Texture("loadgamebutton.png");
        exitbutton = new Texture("exitbutton.png");
        loadgamebutton = new Texture("loadgamebutton.png");
    }

    @Override
    public void inputhandler(){}

    @Override
    public void updatestate(double timegap){}

    @Override
    public void renderscreen(SpriteBatch spriteBatch){}

    public Texture getMenuscreenbg() {
        return Menuscreenbg;
    }

    public Texture getPlaygamebutton() {
        return playgamebutton;
    }

    public Texture getExitbutton() {
        return exitbutton;
    }

    public Texture getLoadgamebutton() {
        return loadgamebutton;
    }

    public void setLoadgamebutton(Texture loadgamebutton) {
        this.loadgamebutton = loadgamebutton;
    }

    @Override
    public void render(SpriteBatch spriteBatch){
        spriteBatch.begin();
        spriteBatch.draw(Menuscreenbg,0,0, 1200,600); //Element positioning from bottom left corner as 0
        spriteBatch.draw(playgamebutton,410,412);//postion of playgame button using figma
        spriteBatch.draw(loadgamebutton,0,0);
        spriteBatch.end();
    }

}
