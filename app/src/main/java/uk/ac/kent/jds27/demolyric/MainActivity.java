package uk.ac.kent.jds27.demolyric;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class MainActivity extends AppCompatActivity {

    private final Play play = new Play();
    private Button playButton;
    private ConstraintLayout addSongConstraint;
    private ConstraintLayout howToConstraint;
    private EditText addLyric;
    private EditText addSong;
    private EditText addArtist;
    private final ArrayList<String> addSongs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.playButton);
        addSongConstraint = findViewById(R.id.addSongConstraint);
        addLyric = findViewById(R.id.addLyric);
        addSong = findViewById(R.id.addSong);
        addArtist = findViewById(R.id.addArtist);
        howToConstraint = findViewById(R.id.howToConstraint);

        configurePlayButton();
    }

    private void configurePlayButton() {
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GameScreen.class));
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

    public void showHowTo (View view) {
        howToConstraint.setVisibility(View.VISIBLE);
    }

    public void closeHowTo(View view) {
        howToConstraint.setVisibility(View.INVISIBLE);
    }

}