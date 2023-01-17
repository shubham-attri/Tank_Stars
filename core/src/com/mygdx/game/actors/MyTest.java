package com.mygdx.game.actors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyTest {

    @Test
    public void testfuelchecker() {
        Sumoffuel mySum = new Sumoffuel(1, 1); int sum = mySum.fuelchecksum(); assertEquals(2, sum);
    }
}