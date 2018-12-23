package uk.ac.kent.jds27.demolyric;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class Game
{
    private Lyrics lyric;
    private Answers answer;
    private LyricAndAnswers la;
    private Random randomGenerator;
    private String randomLyric;
    private String lyricString;
    private int lyricInt;
    private String gameOver;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        lyric = new Lyrics();
        answer = new Answers();
        la = new LyricAndAnswers();
        randomLyric = null;
        randomGenerator = new Random();
        lyricInt = 0;
        gameOver = "Game complete";
    }

    public String randomLyrics()
    {
        int index = randomGenerator.nextInt(lyric.getLyricsList().size());
        if(index == 0) {
            index++;
            return lyricString;
        }
        else {
            lyricString = lyric.getLyric(index);
            lyricInt = lyric.getIndexByLyric(lyricString);
            System.out.println(lyricString);
            lyric.getLyricsList().remove(index);
            return lyricString;
        }
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

    public void addList(ArrayList list) {
        la.addList(list);
    }

    public String getAnswer()
    {
        if(answer.getAnswerArray().size() == 1) {
            return gameOver;
        }
        else {
            String answerString = answer.getAnswer(lyricInt);
            System.out.println(answerString);
            answer.getAnswerArray().remove(answerString);
            return answerString;
        }
    }

}

