package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        // Read users cart in database and add buttons to the scroll layout
    }

    public void displayItems(View view) {

    }

    public void incrementItem(View view) {
        // Write to cart database, item amount + 1
        // redisplay onCreate
    }

    public void decrementItem(View view) {
        // Write to cart database, item amount - 1
        // if amount is already 1, do nothing
        // redisplay onCreate

    }

    public void removeItem(View view) {
        // Look in cart database and remove item
        // redisplay onCreate

    }

    public void checkout(View view) {
        // Write order to both owner and customer
        // Clear cart
    }
}