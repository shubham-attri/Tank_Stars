package com.mygdx.game.States;

// This is game state manager which will show which state the game is in like play, pause, menu or so.
// we can make it in many ways like with the help of stack or queues or even arrays, in demo they used stack, but would
// be using a arraylist here, because of other functionalities.

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Stack;

public class GameStateManager {
    private Stack<States> states;
    public GameStateManager(){
        states = new Stack<>();
    }

    //adding the state to the end
    public  void addstate(States state){
        states.push(state);
    }

    //removing the state to the end
    public void removestate(){
        try {
            states.pop();
        }
        catch (Exception e){
            System.out.println("State index out of bound while poping!");
        }
    }

    //setting the state at the end
    public void setState(States state){
        states.pop();
        states.push(state);
    }

    public Stack<States> getStates() {
        return states;
    }

    public void setStates(Stack<States> states) {
        this.states = states;
    }

    //updating the render screen according to the state
    public void updaterenderscreen(double timegap){
        try{
            states.peek().updatestate(timegap);
        }
        catch(Exception e){
            System.out.println("State Index out of bound while rendering!");
        }
    }

    //rendering the state
    public void renderscreen(SpriteBatch spriteBatch){
        try{
            states.peek().renderscreen(spriteBatch);
        }
        catch(Exception e){
            System.out.println("State Index out of bound while rendering screen!");
        }
    }
}
