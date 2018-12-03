package com.coreyjoseph.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

        public void convertClick (View view) {
           double changeRate;
           changeRate = 2.7;

            EditText edit= new EditText(this);
            edit.setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL );
            EditText numberText = (EditText) findViewById(R.id.numberText);

            double numText = Double.parseDouble(numberText.getText().toString());
            double conExchange = numText*changeRate;


            Toast.makeText(MainActivity.this, "$" + conExchange,Toast.LENGTH_LONG). show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
