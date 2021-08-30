package com.example.android.appjustjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int quantity = 4;
        display(quantity);
        displayPrice(quantity * 5);
    }

    /**
     * This method display the given quantity value on the screen
     */
    private void display (int number) {
        String str = String.valueOf(number);
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(str);
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}