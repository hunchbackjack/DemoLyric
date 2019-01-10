package uk.ac.kent.jds27.demolyric;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DecadeSelect extends AppCompatActivity {

    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button twentyButton;
    private Button tenButton;
    public static boolean fiveClicked;
    public static boolean sixClicked;
    public static boolean sevenClicked;
    public static boolean eightClicked;
    public static boolean nineClicked;
    public static boolean twentyClicked;
    public static boolean tenClicked;
    private int tempListSize = 0;
    private final LyricAndAnswers la = new LyricAndAnswers();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decade_select);
        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);
        sevenButton = findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton = findViewById(R.id.nineButton);
        twentyButton = findViewById(R.id.twentyButton);
        tenButton = findViewById(R.id.tenButton);
        fiveClicked = false;
        sixClicked = false;
        sevenClicked = false;
        eightClicked = false;
        nineClicked = false;
        twentyClicked = false;
        tenClicked = false;
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
            startActivity(new Intent(DecadeSelect.this, GameScreen.class));
        }
    }
}
