package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.TankStars;

public class screen4 implements Screen {

    private final TankStars tankStars;
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setTankselectbg(Image tankselectbg) {
        this.tankselectbg = tankselectbg;
    }

    public void setFlamy(Image flamy) {
        this.flamy = flamy;
    }

    public void setFlamyname(Image flamyname) {
        this.flamyname = flamyname;
    }

    public void setFiery(Image fiery) {
        this.fiery = fiery;
    }

    public void setFieryname(Image fieryname) {
        this.fieryname = fieryname;
    }

    public void setColdie(Image coldie) {
        Coldie = coldie;
    }

    public void setColdiename(Image coldiename) {
        Coldiename = coldiename;
    }

    public void setGreenie(Image greenie) {
        this.greenie = greenie;
    }

    public void setGreeniename(Image greeniename) {
        this.greeniename = greeniename;
    }

    public void setTag(Image tag) {
        this.tag = tag;
    }

    public TankStars getTankStars() {
        return tankStars;
    }

    public Stage getStage() {
        return stage;
    }

    public Image getTankselectbg() {
        return tankselectbg;
    }

    public Image getFlamy() {
        return flamy;
    }

    public Image getFlamyname() {
        return flamyname;
    }

    public Image getFiery() {
        return fiery;
    }

    public Image getFieryname() {
        return fieryname;
    }

    public Image getColdie() {
        return Coldie;
    }

    public Image getColdiename() {
        return Coldiename;
    }

    public Image getGreenie() {
        return greenie;
    }

    public Image getGreeniename() {
        return greeniename;
    }

    public Image getTag() {
        return tag;
    }

    private Image tankselectbg;
    private Image flamy;
    private Image flamyname;
    private Image fiery;
    private Image fieryname;
    private Image Coldie;
    private Image Coldiename;
    private Image greenie;
    private Image greeniename;
    private Image tag;


    //Implementing polymorphism
    public void update2(float delta){
        render(delta);
    }

    public void update2(float delta,float beta){
        render(delta);
    }

    public screen4(final TankStars tankStars){
        this.tankStars = tankStars;
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        Texture ts = new Texture("Play Game -1.png");
        Texture i = new Texture("flamy.png");
        Texture j = new Texture("fiery.png");
        Texture k = new Texture("Coldie.png");
        Texture l = new Texture("Greenie.png");
        Texture m = new Texture("Group 7.png");

        tankselectbg = new Image(ts);
        tankselectbg.setPosition(0,0);
        stage.addActor(tankselectbg);


        flamy = new Image(i);
        flamy.setPosition(126,92);
        stage.addActor(flamy);

        fiery = new Image(j);
        fiery.setPosition(382,92);
        stage.addActor(fiery);

        Coldie = new Image(k);
        Coldie.setPosition(650,92);
        stage.addActor(Coldie);

        greenie = new Image(l);
        greenie.setPosition(903,92);
        stage.addActor(greenie);

        tag = new Image(m);
        tag.setPosition(400,300);
        stage.addActor(tag);



    }

    @Override
    public void show() {

        System.out.println("show");
        Coldie.setPosition(650,92);
        greenie.setPosition(903,92);




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

    private void update(float delta) {
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

    }
}
