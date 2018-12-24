package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;

class Play
{
    private Game game;

    public Play() {
        game = new Game();
    }

    public String haveGo()
    {
        //String go = game.randomLyrics() + "\n" + "\n" + "\n" + game.getAnswer();
        return game.randomLAA();
    }

    public void reset() {
        game = new Game();
    }

    public void addLaa(String laa) {
        game.addLaa(laa);
        Log.d("Play", "String: " + laa);
    }

    public void addList(ArrayList<String> list) {
        game.addList(list);
    }

    public int getListSize() {
        return game.getListSize();
    }
}
