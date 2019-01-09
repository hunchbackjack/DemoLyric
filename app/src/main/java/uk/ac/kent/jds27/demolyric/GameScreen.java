package uk.ac.kent.jds27.demolyric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameScreen extends AppCompatActivity {

    private final Play play = new Play();
    private final ArrayList<String> addSongs = new ArrayList<>();
    private final ArrayList<String> tempSongs = new ArrayList<>();
    private TextView lyricString;
    private TextView turnCount;
    private Button nextButton;
    private Button playAgainButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button twentyButton;
    private Button tenButton;
    private Button submitDecade;
    private Button homeButton;
    private TextView timer;
    private Button turnSubmit;
    private Button timeSubmit;
    private EditText editTurn;
    private EditText editTime;
    private int count = 0;
    private int goCount = 20;
    private int timeCount = 11000;
    private int listSize = tempSongs.size();
    private CountDownTimer cTimer;
    private LyricAndAnswers la = new LyricAndAnswers();
    private boolean fiveClicked;
    private boolean sixClicked;
    private boolean sevenClicked;
    private boolean eightClicked;
    private boolean nineClicked;
    private boolean twentyClicked;
    private boolean tenClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        lyricString = findViewById(R.id.lyricString);
        turnCount = findViewById(R.id.turnCount);
        nextButton = findViewById(R.id.nextButton);
        playAgainButton = findViewById(R.id.playAgainButton);
        editTurn = findViewById(R.id.editTurn);
        turnSubmit = findViewById(R.id.turnSubmit);
        timer = findViewById(R.id.timer);
        cTimer = null;
        timeSubmit = findViewById(R.id.timeSubmit);
        editTime = findViewById(R.id.editTime);
        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);
        sevenButton = findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton = findViewById(R.id.nineButton);
        twentyButton = findViewById(R.id.twentyButton);
        tenButton = findViewById(R.id.tenButton);
        submitDecade = findViewById(R.id.submitDecade);
        fiveClicked = false;
        homeButton = findViewById(R.id.homeButton);
    }

    @SuppressWarnings("WeakerAccess")
    public void haveGo(@SuppressWarnings("unused") View view) {
        count++;
        if (count <= goCount) {
            turnCount.setText(new StringBuilder().append(count).append("/").append(goCount));
        }
        if (cTimer != null) {
            cTimer.cancel();
        }
        if (count > goCount) {
            listSize = tempSongs.size();
            lyricString.setText(getString(R.string.game_complete));
            nextButton.setVisibility(View.INVISIBLE);
            homeButton.setVisibility(View.VISIBLE);
            if(listSize >= goCount) {
                playAgainButton.setVisibility(View.VISIBLE);
            }
        } else {
            String turn = play.haveDecadeGo(tempSongs);
            lyricString.setText(turn);
            cTimer = new CountDownTimer(timeCount, 1000) {

                @SuppressLint("SetTextI18n")
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
        nextButton.setVisibility(View.VISIBLE);
        playAgainButton.setVisibility(View.INVISIBLE);
    }

    public void goHome(View view) {
        startActivity(new Intent(GameScreen.this, MainActivity.class));
    }

    public void changeTimeCount(View view) {
        editTime.setVisibility(View.VISIBLE);
        timeSubmit.setVisibility(View.VISIBLE);
    }

    public void submitTimeCount(View view) {
        String value = editTime.getText().toString();

        try {
            int time = Integer.parseInt(value);
            timeCount = time * 1000;
        } catch (NumberFormatException ex) {
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        editTime.setVisibility(View.INVISIBLE);
        timeSubmit.setVisibility(View.INVISIBLE);
    }

    public void changeTurnCount(View view) {
        editTurn.setVisibility(View.VISIBLE);
        turnSubmit.setVisibility(View.VISIBLE);
    }

    public void submitTurnCount(View view) {
        String value = editTurn.getText().toString();
        try {
            int turn = Integer.parseInt(value);
            if (turn > listSize) {
                Toast sizeToast = Toast.makeText(this, "Please input " + listSize + " or lower.", Toast.LENGTH_LONG);
                sizeToast.show();
            } else {
                goCount = turn;
            }
        } catch (NumberFormatException ex) {
            Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_LONG);
            toast.show();
        }

        editTurn.setVisibility(View.INVISIBLE);
        turnSubmit.setVisibility(View.INVISIBLE);
    }

    public void addFifties(View view) {
        if(fiveClicked == false) {
            tempSongs.addAll(la.getFiveList());
            fiveClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void addSixties(View view) {
        if(sixClicked == false) {
            tempSongs.addAll(la.getSixList());
            sixClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void addSeventies(View view) {
        if(sevenClicked == false) {
            tempSongs.addAll(la.getSevenList());
            sevenClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }    }

    public void addEighties(View view) {
        if(eightClicked == false) {
            tempSongs.addAll(la.getEightList());
            eightClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }    }

    public void addNineties(View view) {
        if(nineClicked == false) {
            tempSongs.addAll(la.getNineList());
            nineClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }    }

    public void addNoughties(View view) {
        if(twentyClicked == false) {
            tempSongs.addAll(la.getTwentyList());
            twentyClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }    }

    public void addTens(View view) {
        if(tenClicked == false) {
            tempSongs.addAll(la.getTenList());
            tenClicked = true;
        }
        else {
            Toast toast = Toast.makeText(this, "Decade already added", Toast.LENGTH_LONG);
            toast.show();
        }    }

    public void submitDecade(View view) {
        if(tempSongs.size() < 20) {
            Toast toast = Toast.makeText(this, "Please select an additional decade", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            fiveButton.setVisibility(View.INVISIBLE);
            sixButton.setVisibility(View.INVISIBLE);
            sevenButton.setVisibility(View.INVISIBLE);
            eightButton.setVisibility(View.INVISIBLE);
            nineButton.setVisibility(View.INVISIBLE);
            twentyButton.setVisibility(View.INVISIBLE);
            tenButton.setVisibility(View.INVISIBLE);
            submitDecade.setVisibility(View.INVISIBLE);
            nextButton.setVisibility(View.VISIBLE);
            listSize = tempSongs.size();
            haveGo(nextButton);
        }
    }
}
