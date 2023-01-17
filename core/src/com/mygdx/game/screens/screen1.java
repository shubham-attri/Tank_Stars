package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn;

public class screen1 implements Screen {

    //This is for the sigleton desgin pattern.
    private final TankStars tankStars;
    private Stage stage;
    private Image Menuscreenbg;
    private Image playgamebutton;
    private Image loadgamebutton;
    private Image exitbutton;

    public screen1(final TankStars tankstars){
        this.tankStars = tankstars;
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Texture screentex = new Texture("Menuscreenbg.png");
        Menuscreenbg = new Image(screentex);
        Menuscreenbg.setPosition(0, 0);
        stage.addActor(Menuscreenbg);

        Texture pgb = new Texture("playgamebutton.png");
        playgamebutton = new Image(pgb);playgamebutton.setPosition(403,412);
        stage.addActor(playgamebutton);

        Texture lgb = new Texture("loadgamebutton.png");
        loadgamebutton = new Image(lgb);loadgamebutton.setPosition(403,300);
        stage.addActor(loadgamebutton);

        Texture eb = new Texture("exitbutton.png");
        exitbutton = new Image(eb);exitbutton.setPosition(403,188);
        stage.addActor(exitbutton);



    }


    public TankStars getTankStars() {
        return tankStars;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Image getMenuscreenbg() {
        return Menuscreenbg;
    }

    public void setMenuscreenbg(Image menuscreenbg) {
        Menuscreenbg = menuscreenbg;
    }

    public Image getPlaygamebutton() {
        return playgamebutton;
    }

    public void setPlaygamebutton(Image playgamebutton) {
        this.playgamebutton = playgamebutton;
    }

    public Image getLoadgamebutton() {
        return loadgamebutton;
    }

    public void setLoadgamebutton(Image loadgamebutton) {
        this.loadgamebutton = loadgamebutton;
    }

    public Image getExitbutton() {
        return exitbutton;
    }

    public void setExitbutton(Image exitbutton) {
        this.exitbutton = exitbutton;
    }

    @Override
    public void show() {
        System.out.println("show");

        loadgamebutton.setPosition(403,300);
        playgamebutton.setPosition(403,412);
        exitbutton.setPosition(403,188);

        playgamebutton.addAction(fadeIn(2f));
        loadgamebutton.addAction(fadeIn(2f));
        exitbutton.addAction(fadeIn(2f));



    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        update(delta);
        stage.draw();
        tankStars.spritebatch.begin();
        tankStars.spritebatch.end();
    }

    public void update(float delta){
        stage.act(delta);
    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
