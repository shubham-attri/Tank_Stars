package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.*;

public class screen3 implements Screen {
    private final TankStars tankStars;
    private Stage stage;

    public TankStars getTankStars() {
        return tankStars;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Image getVs() {
        return vs;
    }

    public void setVs(Image vs) {
        this.vs = vs;
    }

    public Image getBackbut() {
        return backbut;
    }

    public void setBackbut(Image backbut) {
        this.backbut = backbut;
    }

    public Image getBackground() {
        return background;
    }

    public void setBackground(Image background) {
        this.background = background;
    }

    private Image vs;
    private Image backbut;
    private Image background;
    public screen3(final TankStars tankStars){
        this.tankStars = tankStars;
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Texture g1 = new Texture("1v1.png");
        Texture bk = new Texture("back.png");
        Texture bg = new Texture("Menuscreenbg.png");
        background = new Image(bg);
        background.setPosition(0,0);
        stage.addActor(background);

        vs = new Image(g1);
        vs.setPosition(403,324);
        stage.addActor(vs);

        backbut = new Image(bk);
        backbut.setPosition(403,206);
        stage.addActor(backbut);



    }
    @Override
    public void show() {

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
