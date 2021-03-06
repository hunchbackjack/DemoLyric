package uk.ac.kent.jds27.demolyric;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class MainActivity extends AppCompatActivity {

    public static final LyricAndAnswers la = new LyricAndAnswers();
    private final Play play = new Play();
    private final ArrayList<String> addSongs = new ArrayList<>();
    private Button playButton;
    private Button play2Button;
    private Button songButton;
    private ConstraintLayout addSongConstraint;
    private ConstraintLayout howToConstraint;
    private EditText addLyric;
    private EditText addSong;
    private EditText addArtist;
    public static boolean singlePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.playButton);
        play2Button = findViewById(R.id.play2Button);
        addSongConstraint = findViewById(R.id.addSongConstraint);
        addLyric = findViewById(R.id.addLyric);
        addSong = findViewById(R.id.addSong);
        addArtist = findViewById(R.id.addArtist);
        howToConstraint = findViewById(R.id.howToConstraint);
        songButton = findViewById(R.id.songButton);

        configurePlayButton();
        configurePlay2Button();
        configureSongsButton();
    }

    private void configurePlayButton() {
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeSelect.class));
                singlePlayer = false;
            }
        });
    }

    private void configurePlay2Button() {
        play2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DecadeSelect.class));
                singlePlayer = true;
            }
        });
    }

    private void configureSongsButton() {
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SongActivity.class));
            }
        });
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
        if (lyricString.length() > 0 && songString.length() > 0 && artistString.length() > 0) {
            String addString = (lyricString + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + songString + " - " + artistString);
            play.addLaa(addString);
            addSongs.add(addString);
            String newSong = (addString.replaceFirst(System.lineSeparator(), ""));
            String newSong1 = (newSong.replaceFirst(System.lineSeparator(), ""));
            Toast toast = Toast.makeText(getApplicationContext(), newSong1, Toast.LENGTH_SHORT);
            LinearLayout layout = (LinearLayout) toast.getView();
            if (layout.getChildCount() > 0) {
                TextView tv = (TextView) layout.getChildAt(0);
                tv.setGravity(Gravity.CENTER_HORIZONTAL);
            }
            toast.show();
            addSongConstraint.setVisibility(View.INVISIBLE);
            addLyric.setText("");
            addSong.setText("");
            addArtist.setText("");
        } else {
            Toast errorToast = Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_LONG);
            errorToast.show();
        }
    }

    public void showHowTo(View view) {
        howToConstraint.setVisibility(View.VISIBLE);
    }

    public void closeHowTo(View view) {
        howToConstraint.setVisibility(View.INVISIBLE);
    }

}