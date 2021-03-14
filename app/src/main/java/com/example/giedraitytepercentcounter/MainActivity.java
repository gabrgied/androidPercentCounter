package com.example.giedraitytepercentcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterNum;
    private TextView tip;
    private int total;
    private SeekBar discount;
    private TextView percent;

    public void setTotal(int total) {
        this.total = total = Integer.parseInt(enterNum.getText().toString()) - ((Integer.parseInt(enterNum.getText().toString()) / 100) * Integer.parseInt(enterNum.getText().toString()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         enterNum = findViewById(R.id.enterNum);
         discount = findViewById(R.id.discount);
         tip = findViewById(R.id.tip);
       total= findViewById(R.id.total);
       percent = findViewById(R.id.percent);

       discount.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            percent.setText(String.valueOf(progress)+ " %");
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (!enterNum.getText().toString().equals(" ")) {
                int temp = Integer.parseInt(enterNum.getText().toString());

            }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        } ;

        enterNum.addTextChangedListener(textWatcher);
}
}