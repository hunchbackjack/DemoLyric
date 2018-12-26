package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("unused")
class Game {
    final LyricAndAnswers la;
    private final Random randomGenerator;
    private String lyricString;
    @SuppressWarnings("unused")
    private int lyricInt;

    Game() {
        la = new LyricAndAnswers();
        randomGenerator = new Random();
        lyricInt = 0;
    }

    @SuppressWarnings("UnusedAssignment")
    String randomLAA() {
        int index = randomGenerator.nextInt(la.getLyricsList().size());
        if (index == 0) {
            index++;
            return lyricString;
        } else {
            lyricString = la.getLyric(index);
            lyricInt = la.getIndexByLyric(lyricString);
            System.out.println(lyricString);
            la.getLyricsList().remove(index);
            return lyricString;
        }
    }

    void addLaa(String laa) {
        la.addLaa(laa);
        Log.d("Game", "String: " + laa);
    }

    void addList(ArrayList<String> list) {
        la.addList(list);
    }

    int getListSize() {
        return la.getListSize();
    }

}

