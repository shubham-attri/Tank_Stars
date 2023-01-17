package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;
import com.mygdx.game.actors.Tank;

public class screen0 implements Screen {
    
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

    public Image getBackgroundimg() {
        return Backgroundimg;
    }

    public void setBackgroundimg(Image backgroundimg) {
        Backgroundimg = backgroundimg;
    }

    private Image Backgroundimg;
    
    public screen0(final TankStars tankStars){
        this.tankStars = tankStars;
        this.stage = new Stage();


        Texture screentex = new Texture("Loading Screen.png");
        Backgroundimg = new Image(screentex);
        Backgroundimg.setPosition(0, 0);
        stage.addActor(Backgroundimg);
        
    }
    @Override
    public void show() {

        Gdx.input.setInputProcessor(stage);

        Runnable changescreen = new Runnable() {
            @Override
            public void run() {

            }
        };

        Backgroundimg.setPosition(0,0);
        Backgroundimg.addAction(Actions.run(changescreen));


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

    void update(float delta){
        //Here we update the screen setting
//        tankStars.setScreen(new screen1(tankStars));
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
            tankStars.setScreen(tankStars.mainmenuscreen);
        }
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
