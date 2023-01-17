package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.States.GameStateManager;
import com.mygdx.game.States.MenuState;
import com.mygdx.game.actors.Tank;
import com.mygdx.game.screens.*;

import java.util.ArrayList;
import java.util.Iterator;

public class TankStars extends Game {

	public static final int WIDTH = 1200;
	public static final int HEIGTH = 600;

	// these are the initial things to be added the game state and spritebatch to render the screen.
	public SpriteBatch spritebatch;
	private GameStateManager gameStateManager;
	public AssetManager assets;

	public screen0 loadingscreen;
	public screen1 mainmenuscreen;
	public screen2 selectgamescreen;
	public screen3 selectmodescreen;
	public screen4 player1tank;
	public screen5 player2tank;
	public screen6 playscreen;
	public screen7 pausescreen;
	public screen8 winscreen;
	public screen9 continuescreen;
	public screen10 playagainscreen;



	@Override
	public void create () {
		spritebatch = new SpriteBatch();
		assets = new AssetManager();
		// This sets the screen to the desired input.

		//initialising the singleton
		loadingscreen = new screen0(this);
		mainmenuscreen = new screen1( this);
		selectgamescreen = new screen2(this);
		selectmodescreen = new screen3(this);
		playscreen = new screen6(this);
		pausescreen = new screen7(this);
		winscreen = new screen8(this);
		continuescreen = new screen9(this);
		playagainscreen = new screen10(this);

//		this.setScreen(new screen0(this));
//		this.setScreen(new screen2(this));
//		this.setScreen(new screen3(this));
		this.setScreen(new screen4(this));
//		gameStateManager = new GameStateManager();
//		ScreenUtils.clear(0, 0, 0, 1);
//		gameStateManager.addstate(new MenuState(gameStateManager));
	}

	public SpriteBatch getSpritebatch() {
		return spritebatch;
	}

	public void setSpritebatch(SpriteBatch spritebatch) {
		this.spritebatch = spritebatch;
	}

	public GameStateManager getGameStateManager() {
		return gameStateManager;
	}

	public void setGameStateManager(GameStateManager gameStateManager) {
		this.gameStateManager = gameStateManager;
	}

	public AssetManager getAssets() {
		return assets;
	}

	public void setAssets(AssetManager assets) {
		this.assets = assets;
	}

	public screen0 getLoadingscreen() {
		return loadingscreen;
	}

	public void setLoadingscreen(screen0 loadingscreen) {
		this.loadingscreen = loadingscreen;
	}

	public screen1 getMainmenuscreen() {
		return mainmenuscreen;
	}

	public void setMainmenuscreen(screen1 mainmenuscreen) {
		this.mainmenuscreen = mainmenuscreen;
	}

	public screen2 getSelectgamescreen() {
		return selectgamescreen;
	}

	public void setSelectgamescreen(screen2 selectgamescreen) {
		this.selectgamescreen = selectgamescreen;
	}

	public screen3 getSelectmodescreen() {
		return selectmodescreen;
	}

	public void setSelectmodescreen(screen3 selectmodescreen) {
		this.selectmodescreen = selectmodescreen;
	}

	public screen4 getPlayer1tank() {
		return player1tank;
	}

	public void setPlayer1tank(screen4 player1tank) {
		this.player1tank = player1tank;
	}

	public screen5 getPlayer2tank() {
		return player2tank;
	}

	public void setPlayer2tank(screen5 player2tank) {
		this.player2tank = player2tank;
	}

	public screen6 getPlayscreen() {
		return playscreen;
	}

	public void setPlayscreen(screen6 playscreen) {
		this.playscreen = playscreen;
	}

	public screen7 getPausescreen() {
		return pausescreen;
	}

	public void setPausescreen(screen7 pausescreen) {
		this.pausescreen = pausescreen;
	}

	public screen8 getWinscreen() {
		return winscreen;
	}

	public void setWinscreen(screen8 winscreen) {
		this.winscreen = winscreen;
	}

	public screen9 getContinuescreen() {
		return continuescreen;
	}

	public void setContinuescreen(screen9 continuescreen) {
		this.continuescreen = continuescreen;
	}

	public screen10 getPlayagainscreen() {
		return playagainscreen;
	}

	public void setPlayagainscreen(screen10 playagainscreen) {
		this.playagainscreen = playagainscreen;
	}

	//this is the render function that will render the screen on the main, this is the visual thing that we will be seeing
	//the most
	@Override
	public void render () {
		super.render();//
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // this will wipe off all the color
//		gameStateManager.updaterenderscreen(Gdx.graphics.getDeltaTime()); // this is the time betweeen the rendering
//		gameStateManager.renderscreen(spritebatch); //this is the render function called from the gamestatemanager
	}
	
	@Override
	public void dispose () {
		try {
			spritebatch.dispose();
			this.getScreen().dispose();
			assets.dispose();
			loadingscreen.dispose();
		}
		catch (Exception e){
			System.out.println(e);
		}

//		spritebatch.dispose();
//		this.getScreen().dispose();
//		assets.dispose();
//		loadingscreen.dispose();

	}
	
	public void changescreenswithitereator(){
		ArrayList<Tank> bulletToRemove = new ArrayList<Tank>();
		Iterator<Tank> iter = Tank.iterator();
		while (iter.hasNext()) {break;
		}
			Tank bull = iter.next();
		}
}
