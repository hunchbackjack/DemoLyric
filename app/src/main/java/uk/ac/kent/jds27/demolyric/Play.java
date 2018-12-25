package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;

class Play
{
    private Game game;

    Play() {
        game = new Game();
    }

    String haveGo()
    {
        return game.randomLAA();
    }

    void reset() {
        game = new Game();
    }

    void addLaa(String laa) {
        game.addLaa(laa);
        Log.d("Play", "String: " + laa);
    }

    void addList(ArrayList<String> list) {
        game.addList(list);
    }

    int getListSize() {
        return game.getListSize();
    }
}
