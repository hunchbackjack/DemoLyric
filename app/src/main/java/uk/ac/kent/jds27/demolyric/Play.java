package uk.ac.kent.jds27.demolyric;

import java.util.ArrayList;

class Play {
    private Game game;

    Play() {
        game = new Game();
    }

    String haveGo() {
        return game.randomLAA();
    }

    String haveDecadeGo(ArrayList<String> array) {
        return game.randomDecadeLAA(array);
    }

    void reset() {
        game = new Game();
    }

    void addLaa(String laa) {
        game.addLaa(laa);
    }

    void addList(ArrayList<String> list) {
        game.addList(list);
    }

    int getListSize() {
        return game.getListSize();
    }
}
