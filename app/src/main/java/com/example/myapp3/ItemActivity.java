package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class ItemActivity extends AppCompatActivity {
    String id = "";
    static TextView item_total;
    GridView grid_View;
    static int total_price = 0;
    Button item_payment;

    String pdt_name[] = {"SUPxSTone", "NIKEFLYNIT", "Diptyque", "Hermes", "NIKExSACAI", "PORTERxDORAEMON", "AirPods Max", "Bearbrick", "LouisVuitton"};

    int pdt_photo[] = {R.drawable.poto1, R.drawable.poto2, R.drawable.poto3, R.drawable.poto4,
            R.drawable.poto5, R.drawable.poto6, R.drawable.poto11, R.drawable.poto8, R.drawable.poto10};

    int pdt_price[] = {428000, 450000, 190000, 298000, 902000, 481000, 53900, 234000, 990000};

    int pdt_count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //상태바 없애기
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_item);

        //화면에 연결
        item_total = findViewById(R.id.item_total);
        grid_View = findViewById(R.id.grid_view);
        item_payment = findViewById(R.id.item_payment);

        item_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ItemActivity.this, "" + total_price + "원 결제완료", + Toast.LENGTH_SHORT).show();
            }
        });

        item_total.setText("총 가격 : " + total_price + " 원");

        ItemAdapter adapter = new ItemAdapter(ItemActivity.this, pdt_name, pdt_photo, pdt_price, pdt_count);
        grid_View.setAdapter(adapter);

    }

    public String addComma(int number) {
        String result = "";
        StringBuffer sb = new StringBuffer();
        result = "" + number;
        sb.append(result);

        if (number < 1000) {
        } else if (number < 1000000) {

            if (number < 10000) {

                sb.insert(1, ",");

            } else if (number < 100000) {

                sb.insert(2, ",");
            } else {

                sb.insert(3, ",");
            }
        } else if (number < 1000000000) {
            if (number < 10000000) {
                sb.insert(4, ",");
                sb.insert(1, ",");
            }
            else if(number < 100000000){
                sb.insert(5, ",");
                sb.insert(2, ",");
            }
            else {
                sb.insert(6, ",");
                sb.insert(2, ",");
            }
        }


        return sb.toString();
    }
    void getData(){
        id = getIntent().getStringExtra("myId");



    }
}


