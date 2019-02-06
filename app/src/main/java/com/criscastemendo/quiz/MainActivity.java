package com.criscastemendo.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView answertext,questiontext;
    private Button truebutton,nextbutton,cheatbutton,falsebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answertext = findViewById(R.id.answertext);
        questiontext = findViewById(R.id.questiontext);
        truebutton = findViewById(R.id.truebutton);
        falsebutton = findViewById(R.id.falsebutton);
        cheatbutton = findViewById(R.id.cheatbutton);
        nextbutton = findViewById(R.id.nextbutton);
    }

    public void onfalsebuttonclicked(View view){

        Log.e( "MainActivity",  "onfalsebuttonclicked");

    }
    public void ontruebuttonclicked(View view){

        Log.e( "MainActivity",  "ontruebuttonclicked");

        answertext.setText(R.string.truebutton);
    }
}
