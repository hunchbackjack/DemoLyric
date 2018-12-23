package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.*;

public class Play
{
    private Game game;

    /**
     * Constructor for objects of class Play
     */
    public Play() {
        game = new Game();
        game.randomLyrics();
    }

    public String haveGo()
    {
        //String go = game.randomLyrics() + "\n" + "\n" + "\n" + game.getAnswer();
        String go = game.randomLAA();
        return go;
    }

    public void reset() {
        game = new Game();
        game.randomLyrics();
    }

    public void addLaa(String laa) {
        game.addLaa(laa);
        Log.d("Play", "String: " + laa);
    }

    public void addList(ArrayList list) {
        game.addList(list);
    }
}
