package com.example.android.appjustjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity = 0;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity);
        displayMessage(quantity);
    }

    /**
     * This method display the given quantity value on the screen
     */
    private void display(int quantity) {
        String str = String.valueOf(quantity);
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(str);
    }

    private void displayPrice(int quantity) {
        quantity *= 5;
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
    }

    private void displayMessage(int quantity) {
        String message = "Total: $" + (quantity * 5) + "\nThank you!";
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method is called when the plus button is clicked
     *
     * @param view
     */
    public void increment(View view) {
        quantity++;
        display(quantity);
        displayPrice(quantity);
    }

    /**
     * This method is called when the minus button is clicked
     *
     * @param view
     */
    public void decrement(View view) {
        if (quantity == 0) return;
        quantity--;
        display(quantity);
        displayPrice(quantity);
    }
}