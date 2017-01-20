package com.example.bmorledge_hampton19.androidyahtzee;
// Lots o' imports.
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simulates dice rolling by rotating through a set of die face images.
 */
public class Yahtzee extends AppCompatActivity {

    // The view windows for the dice images.
    ImageView[] imageViews;

    // The imageID's for the different die faces.
    int[] imageIDs;

    // A random number generator.
    Random RNG;

    // The number of dice rotations in the current roll.
    int diceRolls;

    // The total of the dice.
    int diceTotal;

    // Stuff to make a timer.
    Timer timer;
    Handler handler;
    Runnable runnable;

    @Override
    // Main function
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Image ID's and views.
        imageViews = new ImageView[5];
        imageIDs = new int[6];
        RNG = new Random();

        imageViews[0] = (ImageView)findViewById(R.id.imageView1);
        imageViews[1] = (ImageView)findViewById(R.id.imageView2);
        imageViews[2] = (ImageView)findViewById(R.id.imageView3);
        imageViews[3] = (ImageView)findViewById(R.id.imageView4);
        imageViews[4] = (ImageView)findViewById(R.id.imageView5);

        imageIDs[0] = (R.drawable.onedie);
        imageIDs[1] = (R.drawable.twodie);
        imageIDs[2] = (R.drawable.threedie);
        imageIDs[3] = (R.drawable.fourdie);
        imageIDs[4] = (R.drawable.fivedie);
        imageIDs[5] = (R.drawable.sixdie);

        // Roll when the button is clicked.
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Reset diceRolls.
                diceRolls = 0;

                // Create a timer to roll the dice.
                timer = new Timer();

                timer.scheduleAtFixedRate(new TimerTask() {
                    public void run() {

                        // Create a handler to get around messy threads.
                        handler = new Handler(Yahtzee.this.getApplicationContext().getMainLooper());
                        runnable = new Runnable() {
                            public void run() {

                                // Increment diceRolls.
                                diceRolls++;

                                // Roll the dice.
                                rollDice();

                                // Check to see if it's time to kill the timer.
                                if (diceRolls == 20) timer.cancel();

                            }
                        };

                        // More icky stuff to get around threads.
                        handler.post(runnable);

                    }
                },0,100);

            }
        });


    }

    // Roll the dice by changing each image to a random face.
    public void rollDice() {

        // Reset diceTotal
        diceTotal = 0;

        // Change each dice face while also accumulating the total.
        for (int i = 0; i < 5; i++) {
            int dieValue = RNG.nextInt(6);
            imageViews[i].setImageResource(imageIDs[dieValue]);
            diceTotal += dieValue + 1;
        }

        // Display the total.
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.format("Total: %d", diceTotal));

    }

}
