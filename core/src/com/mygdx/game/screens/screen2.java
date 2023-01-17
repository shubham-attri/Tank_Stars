package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;



public class screen2 implements Screen {

    private final TankStars tankStars;
    private Stage stage;
    private Image game1;
    private Image game2;
    private Image game3;
    private Image backbut;
    private Image background;
    public screen2(final TankStars tankStars){
        this.tankStars = tankStars;
        this.stage = new Stage();


        Texture g1 = new Texture("game1.png");
        Texture g2 = new Texture("game2.png");
        Texture g3 = new Texture("game3.png");
        Texture bk = new Texture("back.png");
        Texture bg = new Texture("Menuscreenbg.png");
        background = new Image(bg);
        background.setPosition(0,0);
        stage.addActor(background);

        game1 = new Image(g1);
        game1.setPosition(403,412);
        stage.addActor(game1);

        game2 = new Image(g2);
        game2.setPosition(403,300);
        stage.addActor(game2);

        game3 = new Image(g3);
        game3.setPosition(403,188);
        stage.addActor(game3);

        backbut = new Image(bk);
        backbut.setPosition(403,88);
        stage.addActor(backbut);



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

    public Image getGame1() {
        return game1;
    }

    public void setGame1(Image game1) {
        this.game1 = game1;
    }

    public Image getGame2() {
        return game2;
    }

    public void setGame2(Image game2) {
        this.game2 = game2;
    }

    public Image getGame3() {
        return game3;
    }

    public void setGame3(Image game3) {
        this.game3 = game3;
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

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
        game1.setPosition(403,412);
        game2.setPosition(403,300);
        game3.setPosition(403,188);
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
