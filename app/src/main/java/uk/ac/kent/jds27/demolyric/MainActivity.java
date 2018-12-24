package uk.ac.kent.jds27.demolyric;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final Play play = new Play();
    private TextView lyricString;
    private TextView turnCount;
    private TextView timer;
    private Button playButton;
    private Button playAgainButton;
    private Button helpButton;
    private Button turnSubmit;
    private Button timeSubmit;
    private ConstraintLayout addSongConstraint;
    private ConstraintLayout howToConstraint;
    private EditText addLyric;
    private EditText addSong;
    private EditText addArtist;
    private EditText editTurn;
    private EditText editTime;
    private int count = 0;
    private int goCount = 20;
    private int timeCount = 11000;
    private final ArrayList<String> addSongs = new ArrayList<>();
    private CountDownTimer cTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lyricString = findViewById(R.id.lyricString);
        turnCount = findViewById(R.id.turnCount);
        playButton = findViewById(R.id.playButton);
        playAgainButton = findViewById(R.id.playAgainButton);
        helpButton = findViewById(R.id.helpButton);
        addSongConstraint = findViewById(R.id.addSongConstraint);
        addLyric = findViewById(R.id.addLyric);
        addSong = findViewById(R.id.addSong);
        addArtist = findViewById(R.id.addArtist);
        editTurn = findViewById(R.id.editTurn);
        turnSubmit = findViewById(R.id.turnSubmit);
        howToConstraint = findViewById(R.id.howToConstraint);
        timer = findViewById(R.id.timer);
        cTimer = null;
        timeSubmit = findViewById(R.id.timeSubmit);
        editTime = findViewById(R.id.editTime);
    }

    @SuppressWarnings("WeakerAccess")
    public void haveGo(@SuppressWarnings("unused") View view) {
        count++;
        turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));
        helpButton.setVisibility(View.INVISIBLE);
        if(cTimer != null) { cTimer.cancel(); }
        if(count >= goCount) {
            lyricString.setText(getString(R.string.game_complete));
            playButton.setVisibility(View.INVISIBLE);
            playAgainButton.setVisibility(View.VISIBLE);
        }
        else {
            playButton.setText(getString(R.string.next));
            String turn = play.haveGo();
            lyricString.setText(turn);
            cTimer = new CountDownTimer(timeCount, 1000) {

                public void onTick(long millisUntilFinished) {
                    timer.setText("" + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    timer.setText("0");
                }
            }.start();
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

    public void changeTurnCount(View view) {
        editTurn.setVisibility(View.VISIBLE);
        turnSubmit.setVisibility(View.VISIBLE);
    }

    public void submitTimeCount(View view) {
        String value = editTime.getText().toString();

        try{
            int time = Integer.parseInt(value);
                timeCount = time * 1000;
        }catch (NumberFormatException ex) {
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        editTime.setVisibility(View.INVISIBLE);
        timeSubmit.setVisibility(View.INVISIBLE);
    }

    public void changeTimeCount(View view) {
        editTime.setVisibility(View.VISIBLE);
        timeSubmit.setVisibility(View.VISIBLE);
    }

    public void submitTurnCount(View view) {
        String value = editTurn.getText().toString();
        Log.d("MainActivity", "Value: " + value);

        try{
            int turn = Integer.parseInt(value);
            Log.d("MainActivity", "turn: " + turn);
            if(turn > play.getListSize()) {
                Toast sizeToast = Toast.makeText(this, "Please input a number lower than " + play.getListSize(), Toast.LENGTH_LONG);
                sizeToast.show();
            }
            else {
                goCount = turn;
            }
        }catch (NumberFormatException ex) {
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        editTurn.setVisibility(View.INVISIBLE);
        turnSubmit.setVisibility(View.INVISIBLE);
    }

    public void showHowTo (View view) {
        howToConstraint.setVisibility(View.VISIBLE);
    }

    public void closeHowTo(View view) {
        howToConstraint.setVisibility(View.INVISIBLE);
    }
}
