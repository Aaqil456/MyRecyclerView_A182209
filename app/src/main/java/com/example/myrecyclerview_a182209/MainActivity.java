package com.example.myrecyclerview_a182209;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Beverage> allBeverageInfo=getAllBeverageInfo();
    }

    private List<Beverage> getAllBeverageInfo() {
        List<Beverage>allBeverage = new ArrayList<Beverage>();
        allBeverage.add(new Beverage("Flat white",R.drawable.flat_white));
        allBeverage.add(new Beverage("Affogato 2",R.drawable.affogato_2));
        allBeverage.add(new Beverage("cappuchino 1",R.drawable.cappuccino_1));
        allBeverage.add(new Beverage("cappuchino 2",R.drawable.cappuccino_2));
        allBeverage.add(new Beverage("Espresso 1",R.drawable.espresso_1));
        allBeverage.add(new Beverage("Espresso 2",R.drawable.espresso_2));
        allBeverage.add(new Beverage("Green Tea",R.drawable.green_tea));
        allBeverage.add(new Beverage("Latte 1",R.drawable.latte_1));
        allBeverage.add(new Beverage("Latte 2",R.drawable.latte_2));
        allBeverage.add(new Beverage("Long Black",R.drawable.long_black));
        allBeverage.add(new Beverage("Long Black 2",R.drawable.long_black_2));
        allBeverage.add(new Beverage("Macchiato",R.drawable.macchiato));
        allBeverage.add(new Beverage("Mochachinno",R.drawable.mochaccino));


        return  allBeverage;
    }
}