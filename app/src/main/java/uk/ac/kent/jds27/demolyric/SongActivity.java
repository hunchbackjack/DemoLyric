package uk.ac.kent.jds27.demolyric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    private final LyricAndAnswers la = MainActivity.la;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        layout = findViewById(R.id.layout);
        getSongs();
    }

    private void getSongs() {
        for (int i = 0; i < la.getListSize(); i++) {
            String song = la.getLyricsElement(i);
            if (song != null) {
                String newSong = (song.replaceFirst(System.lineSeparator(), ""));
                String newSong1 = (System.lineSeparator() + (newSong.replaceFirst(System.lineSeparator(), "")));
                TextView textView = new TextView(this);
                textView.setText(newSong1);
                layout.addView(textView);
            }
        }
    }
}
