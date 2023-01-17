package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;

public class screen6 implements Screen {


    private final TankStars tankStars;
    private Stage stage;
    private Image background;
    private Image tank1;
    private Image tank2;

    public TankStars getTankStars() {
        return tankStars;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Image getBackground() {
        return background;
    }

    public void setBackground(Image background) {
        this.background = background;
    }

    public Image getTank1() {
        return tank1;
    }

    public void setTank1(Image tank1) {
        this.tank1 = tank1;
    }

    public Image getTank2() {
        return tank2;
    }

    public void setTank2(Image tank2) {
        this.tank2 = tank2;
    }

    public Image getPause() {
        return pause;
    }

    public void setPause(Image pause) {
        this.pause = pause;
    }

    private Image pause;

    public screen6(final TankStars tankStars){
        this.tankStars = tankStars;
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Texture bg = new Texture("Game arena.png");
        Texture t1 = new Texture("image 1 (Traced)-2.png");
        Texture t2 = new Texture("image 1 (Traced)-3.png");
        Texture p = new Texture("vector.png");

        background = new Image(bg);
        background.setPosition(0,0);
        stage.addActor(background);

        tank1 = new Image(t1);
        tank1.setPosition(121,136);
        stage.addActor(tank1);

        tank2 = new Image(t2);
        tank2.setPosition(915,136);
        stage.addActor(tank2);

        pause = new Image(p);
        pause.setPosition(581,503);
        stage.addActor(pause);




    }

    @Override
    public void show() {
        System.out.println("show");
        background.setPosition(0,0);
        tank1.setPosition(121,136);
        tank2.setPosition(915,136);
        pause.setPosition(581,503);

        tank1.addAction(Actions.moveBy(20,0,2f));
        tank2.addAction(Actions.hide());

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
