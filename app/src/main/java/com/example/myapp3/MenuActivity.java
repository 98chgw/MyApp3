package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    int count1 = 0;
    int count2 = 0;

    TextView menu_total1;
    Button menu_plus1;
    Button menu_minus1;
    TextView menu_count1;


    TextView menu_total2;
    Button menu_plus2;
    Button menu_minus2;
    TextView menu_count2;
//    int count = 0;


    String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);


        menu_total1 = findViewById(R.id.menu_total1);
        menu_plus1 = findViewById(R.id.menu_plus1);
        menu_minus1 = findViewById(R.id.menu_minus1);
        menu_count1 = findViewById(R.id.menu_count1);


        menu_total2 = findViewById(R.id.menu_total2);
        menu_plus2 = findViewById(R.id.menu_plus2);
        menu_minus2 = findViewById(R.id.menu_minus2);
        menu_count2 = findViewById(R.id.menu_count2);

        getData();

        menu_plus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                count1++;
                menu_count1.setText(Integer.toString(count1));
            }
        });

        menu_minus1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (count1 > 1 ) {
                    count1--;
                    menu_count1.setText(Integer.toString(count1));
                }

            }
        });


        menu_plus2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                count2++;
                menu_count2.setText(Integer.toString(count2));
            }
        });

        menu_minus2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (count2 > 1 ) {
                    count2--;
                    menu_count2.setText(Integer.toString(count2));
                }
            }
        });





    }

    void getData(){
        id = getIntent().getStringExtra("myId");



    }
}