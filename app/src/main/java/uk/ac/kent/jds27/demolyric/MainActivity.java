package uk.ac.kent.jds27.demolyric;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Game game = new Game();
    Play play = new Play();
    TextView lyricString;
    TextView turnCount;
    Button playButton;
    Button playAgainButton;
    Button helpButton;
    Button addButton;
    ConstraintLayout addSongConstraint;
    EditText addLyric;
    EditText addSong;
    EditText addArtist;
    int count = 0;
    ArrayList<String> addSongs = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lyricString = (TextView) findViewById(R.id.lyricString);
        turnCount = (TextView) findViewById(R.id.turnCount);
        playButton = (Button) findViewById(R.id.playButton);
        playAgainButton = (Button) findViewById(R.id.playAgainButton);
        helpButton = (Button) findViewById(R.id.helpButton);
        addButton = (Button) findViewById(R.id.addButton);
        addSongConstraint = (ConstraintLayout) findViewById(R.id.addSongConstraint);
        addLyric = (EditText) findViewById(R.id.addLyric);
        addSong = (EditText) findViewById(R.id.addSong);
        addArtist = (EditText) findViewById(R.id.addArtist);
    }

    public void haveGo(View view) {
        count++;
        turnCount.setText(count + "/20");
        helpButton.setVisibility(View.INVISIBLE);
        if(count >= 20) {
            lyricString.setText("Game Complete!");
            playButton.setVisibility(View.INVISIBLE);
            playAgainButton.setVisibility(View.VISIBLE);
        }
        else {
            playButton.setText("Next");
            String lyric = game.randomLyrics();
            String answer = game.getAnswer();
            String turn = play.haveGo();
            lyricString.setText(turn);
        }
    }

    public void playAgain(View view) {
        count = 0;
        play.reset();
        play.addList(addSongs);
        haveGo(playAgainButton);
        playButton.setVisibility(View.VISIBLE);
        playAgainButton.setVisibility(View.INVISIBLE);
    }

    public void addSong(View view) {
        addSongConstraint.setVisibility(View.VISIBLE);
    }

    public void closeAddWindow(View view) {
        addSongConstraint.setVisibility(View.INVISIBLE);
        addLyric.setText("");
        addSong.setText("");
        addArtist.setText("");
    }

    public void submitSong(View view) {
        String lyricString = addLyric.getText().toString();
        String songString = addSong.getText().toString();
        String artistString = addArtist.getText().toString();
        if(lyricString.length() > 0 && songString.length() > 0  && artistString.length() > 0 ) {
            String addString = (lyricString + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + songString + " - " + artistString);
            play.addLaa(addString);
            addSongs.add(addString);
            Toast toast = Toast.makeText(getApplicationContext(), addString, Toast.LENGTH_SHORT);
            toast.show();
            addSongConstraint.setVisibility(View.INVISIBLE);
            addLyric.setText("");
            addSong.setText("");
            addArtist.setText("");
        }
        else {
            Toast errorToast = Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_LONG);
            errorToast.show();
        }
    }
}
