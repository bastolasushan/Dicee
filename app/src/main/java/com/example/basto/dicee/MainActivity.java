package com.example.basto.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRoll;
        btnRoll=findViewById(R.id.btnRoll);
        final ImageView imgDice=(ImageView) findViewById(R.id.imgDice);
        final ImageView imgDice2=(ImageView) findViewById(R.id.imgDice2);

        final int[] diceArray= {R.drawable.diceone, R.drawable.dicetwo, R.drawable.dicethree,
                R.drawable.dicefour, R.drawable.dicefive, R.drawable.dicesix};



        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random= new Random();
                int number= random.nextInt(6);

                imgDice.setImageResource(diceArray[number]);

                int randomnumtwo= random.nextInt(6);
                imgDice2.setImageResource(diceArray[randomnumtwo]);




            }
        });


    }
}
