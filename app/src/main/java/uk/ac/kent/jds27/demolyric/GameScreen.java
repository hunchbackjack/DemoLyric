package uk.ac.kent.jds27.demolyric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.content.ContextCompat;
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
    private int tempListSize = 0;
    private CountDownTimer cTimer;
    private final LyricAndAnswers la = new LyricAndAnswers();
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

    public void addFifties(View view) {
        if(!fiveClicked) {
            fiveClicked = true;
            fiveButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getFiveList().size();
        }
        else {
            fiveButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            fiveClicked = false;
            tempListSize -= la.getFiveList().size();
        }
    }

    public void addSixties(View view) {
        if(!sixClicked) {
            sixClicked = true;
            sixButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getSixList().size();
        }
        else {
            sixButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            sixClicked = false;
            tempListSize -= la.getSixList().size();
        }
    }

    public void addSeventies(View view) {
        if(!sevenClicked) {
            sevenClicked = true;
            sevenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getSevenList().size();
        }
        else {
            sevenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            sevenClicked = false;
            tempListSize -= la.getSevenList().size();
        }
    }

    public void addEighties(View view) {
        if(!eightClicked) {
            eightClicked = true;
            eightButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getEightList().size();
        }
        else {
            eightButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            eightClicked = false;
            tempListSize -= la.getEightList().size();
        }
    }

    public void addNineties(View view) {
        if(!nineClicked) {
            nineClicked = true;
            nineButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getNineList().size();
        }
        else {
            nineButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            nineClicked = false;
            tempListSize -= la.getNineList().size();
        }
    }

    public void addNoughties(View view) {
        if(!twentyClicked) {
            twentyClicked = true;
            twentyButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getTwentyList().size();
        }
        else {
            twentyButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            twentyClicked = false;
            tempListSize -= la.getTwentyList().size();
        }
    }

    public void addTens(View view) {
        if(!tenClicked) {
            tenClicked = true;
            tenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
            tempListSize += la.getTenList().size();
        }
        else {
            tenButton.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            tenClicked = false;
            tempListSize -= la.getTenList().size();
        }
    }

    public void submitDecade(View view) {
        if(tempListSize < 20) {
            Toast toast = Toast.makeText(this, "Please select an additional decade", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            if(fiveClicked) {
                tempSongs.addAll(la.getFiveList());
            }
            if(sixClicked) {
                tempSongs.addAll(la.getSixList());
            }
            if(sevenClicked) {
                tempSongs.addAll(la.getSevenList());
            }
            if(eightClicked) {
                tempSongs.addAll(la.getEightList());
            }
            if(nineClicked) {
                tempSongs.addAll(la.getNineList());
            }
            if(twentyClicked) {
                tempSongs.addAll(la.getTwentyList());
            }
            if(tenClicked) {
                tempSongs.addAll(la.getTenList());
            }
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
