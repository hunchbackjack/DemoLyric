package uk.ac.kent.jds27.demolyric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class GameScreen extends AppCompatActivity {

    private final Play play = new Play();
    private final ArrayList<String> addSongs = new ArrayList<>();
    private final ArrayList<String> tempSongs = new ArrayList<>();
    private TextView lyricString;
    private TextView turnCount;
    private Button nextButton;
    private Button playAgainButton;
    private Button homeButton;
    private TextView timer;
    private Button turnSubmit;
    private Button timeSubmit;
    private EditText editTurn;
    private EditText editTime;
    private int count = 0;
    private int goCount = 20;
    private int timeCount = 11000;
    private int listSize;
    private CountDownTimer cTimer;
    private final LyricAndAnswers la = new LyricAndAnswers();

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
        homeButton = findViewById(R.id.homeButton);
        if(DecadeSelect.fiveClicked) {
            tempSongs.addAll(la.getFiveList());
        }
        if(DecadeSelect.sixClicked) {
            tempSongs.addAll(la.getSixList());
        }
        if(DecadeSelect.sevenClicked) {
            tempSongs.addAll(la.getSevenList());
        }
        if(DecadeSelect.eightClicked) {
            tempSongs.addAll(la.getEightList());
        }
        if(DecadeSelect.nineClicked) {
            tempSongs.addAll(la.getNineList());
        }
        if(DecadeSelect.twentyClicked) {
            tempSongs.addAll(la.getTwentyList());
        }
        if(DecadeSelect.tenClicked) {
            tempSongs.addAll(la.getTenList());
        }
        listSize = tempSongs.size();
        haveGo(nextButton);
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
        homeButton.setVisibility(View.INVISIBLE);
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
}
