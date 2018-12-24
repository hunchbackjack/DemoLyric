package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("unused")
class Game
{
    private final LyricAndAnswers la;
    private final Random randomGenerator;
    private String lyricString;
    @SuppressWarnings("unused")
    private int lyricInt;

    public Game()
    {
        la = new LyricAndAnswers();
        randomGenerator = new Random();
        lyricInt = 0;
    }

    public String randomLAA()
    {
        int index = randomGenerator.nextInt(la.getLyricsList().size());
        if(index == 0) {
            index++;
            return lyricString;
        }
        else {
            lyricString = la.getLyric(index);
            lyricInt = la.getIndexByLyric(lyricString);
            System.out.println(lyricString);
            la.getLyricsList().remove(index);
            return lyricString;
        }
    }

    public void addLaa(String laa) {
        la.addLaa(laa);
        Log.d("Game", "String: " + laa);
    }

    public void addList(ArrayList<String> list) {
        la.addList(list);
    }

    public int getListSize() {
        return la.getListSize();
    }

}

