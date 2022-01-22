package com.example.jagadeesan.hiphoptamizha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

public class finalcard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalcard);
        CardForm cardForm = (CardForm) findViewById(R.id.card_form);
        TextView amount=(TextView)findViewById(R.id.payment_amount);
        TextView btnamt=(TextView)findViewById(R.id.btn_pay);
        amount.setText("$100");
        btnamt.setText(" Pay $100");
        Toast.makeText(getBaseContext(),"100$ set",
                Toast.LENGTH_SHORT).show();
        cardForm.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {


            }
        });
    }
}
