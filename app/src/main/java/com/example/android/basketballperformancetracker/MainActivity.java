package com.example.android.basketballperformancetracker;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;
import static com.example.android.basketballperformancetracker.R.id.summation;

public class MainActivity extends AppCompatActivity {

    /**
     * These variables are for two point shots
     */

    int twoPointerTotal = 0;
    int twoPointerMakes = 0;
    double twoPointerPercent = 0;


    /**
     * These variables are for three point shots
     */

    int threePointerTotal = 0;
    int threePointerMakes = 0;
    double threePointerPercent = 0;


    /**
     * These variables are for free throws
     */

    int freeThrowTotal = 0;
    int freeThrowMakes = 0;
    double freeThrowPercent = 0;

    /**
     * These variables are for summation
     */

    int summationMadeShots = 0;
    int summationTotalShots = 0;
    double summationPercent = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method increases the number of two pointer makes
     */

    public void twoPointerMakeIncrement(View view) {
        twoPointerMakes = twoPointerMakes + 1;
        twoPointerTotal = twoPointerTotal + 1;
        twoPointerPercent = 100 * twoPointerMakes / twoPointerTotal;
        displayTwoPointerShots(twoPointerTotal);
        displayTwoPointerPercent(twoPointerPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method increases the number of three pointer makes
     */

    public void threePointerMakeIncrement(View view) {
        threePointerMakes = threePointerMakes + 1;
        threePointerTotal = threePointerTotal + 1;
        threePointerPercent = 100 * threePointerMakes / threePointerTotal;
        displayThreePointerShots(threePointerTotal);
        displayThreePointerPercent(threePointerPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method increases the number of free throw makes
     */

    public void freeThrowMakeIncrement(View view) {
        freeThrowMakes = freeThrowMakes + 1;
        freeThrowTotal = freeThrowTotal + 1;
        freeThrowPercent = 100 * freeThrowMakes / freeThrowTotal;
        displayFreeThrowShots(freeThrowTotal);
        displayFreeThrowPercent(freeThrowPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method increases the total number of two pointers
     */

    public void twoPointerIncrement(View view) {
        twoPointerTotal = twoPointerTotal + 1;
        twoPointerPercent = 100 * twoPointerMakes / twoPointerTotal;
        displayTwoPointerShots(twoPointerTotal);
        displayTwoPointerPercent(twoPointerPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method increases the total number of three pointers
     */

    public void threePointerIncrement(View view) {
        threePointerTotal = threePointerTotal + 1;
        threePointerPercent = 100 * threePointerMakes / threePointerTotal;
        displayThreePointerShots(threePointerTotal);
        displayThreePointerPercent(threePointerPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method increases the total number of free throws
     */

    public void freeThrowIncrement(View view) {
        freeThrowTotal = freeThrowTotal + 1;
        freeThrowPercent = 100 * freeThrowMakes / freeThrowTotal;
        displayFreeThrowShots(freeThrowTotal);
        displayFreeThrowPercent(freeThrowPercent);
        summationMadeShots = twoPointerMakes + threePointerMakes + freeThrowMakes;
        summationTotalShots = twoPointerTotal + threePointerTotal + freeThrowTotal;
        summationPercent = 100 * summationMadeShots / summationTotalShots;
        displaySummation(summationTotalShots, summationPercent);
    }


    /**
     * This method resets the variables
     */

    public void summationReset(View view) {
        twoPointerTotal = 0;
        twoPointerMakes = 0;
        twoPointerPercent = 0;
        threePointerTotal = 0;
        threePointerMakes = 0;
        threePointerPercent = 0;
        freeThrowTotal = 0;
        freeThrowMakes = 0;
        freeThrowPercent = 0;
        summationTotalShots = 0;
        summationMadeShots = 0;
        summationPercent = 0;
        displayTwoPointerShots(twoPointerTotal);
        displayTwoPointerPercent(twoPointerPercent);
        displayThreePointerShots(threePointerTotal);
        displayThreePointerPercent(threePointerPercent);
        displayFreeThrowShots(freeThrowTotal);
        displayFreeThrowPercent(freeThrowPercent);
        displaySummation(summationTotalShots, summationPercent);
    }



    /**
     * This method displays the total two pointer shots
     */


    public void displayTwoPointerShots(int twoPointerTotal) {
        TextView twoPointerShotView = (TextView) findViewById(R.id.two_pointer_shots);
        twoPointerShotView.setText(twoPointerTotal + " shots");
    }


    /**
     * This method displays the total three pointer shots
     */


    public void displayThreePointerShots(int threePointerTotal) {
        TextView threePointerShotView = (TextView) findViewById(R.id.three_pointer_shots);
        threePointerShotView.setText(threePointerTotal + " shots");
    }


    /**
     * This method displays the total free throw shots
     */


    public void displayFreeThrowShots(int freeThrowTotal) {
        TextView freeThrowShotView = (TextView) findViewById(R.id.free_throw_shots);
        freeThrowShotView.setText(freeThrowTotal + " shots");
    }


    /**
     * This method displays the percent of two pointer shots
     */


    public void displayTwoPointerPercent(double twoPointerPercent) {
        TextView twoPointerPercentView = (TextView) findViewById(R.id.two_pointer_percent);
        twoPointerPercentView.setText(String.format("%.0f", twoPointerPercent) + "% shooting");
    }


    /**
     * This method displays the percent of three pointer shots
     */


    public void displayThreePointerPercent(double threePointerPercent) {
        TextView threePointerPercentView = (TextView) findViewById(R.id.three_pointer_percent);
        threePointerPercentView.setText(String.format("%.0f", threePointerPercent) + "% shooting");
    }


    /**
     * This method displays the percent of free throws
     */


    public void displayFreeThrowPercent(double freeThrowPercent) {
        TextView freeThrowPercentView = (TextView) findViewById(R.id.free_throw_percent);
        freeThrowPercentView.setText(String.format("%.0f", freeThrowPercent) + "% shooting");
    }

    /**
     * This method displays the summation for shots and percentage
     */

    public void displaySummation(int summationTotalShots, double summationPercent) {
        TextView summationDisplayText = (TextView) findViewById(summation);
        summationDisplayText.setText(summationTotalShots + " shots on " + String.format("%.0f", summationPercent) + "% shooting");
    }


}

