package com.example.mysecapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button();

    }

    public void button() {


        button1 = (Button) findViewById(R.id.bnt);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.bnt2);
        button2.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.txt);


    }

    public void onClick(View v) {
        Random rand = new Random();
        ArrayList list = new ArrayList();
        if (v.getId() == R.id.bnt) {
            for (int number = 1; number <= 6; number++) {
                int randomNumber = rand.nextInt(49) + 1;
                list.add(randomNumber);
                Collections.sort(list);
                String list1 = list.toString();
                textView.setText("Вашите печеливши числа са:" + list1);

            }

        }else if(v.getId()== R.id.bnt2) {
            for (int number = 1; number <= 5; number++) {
                int randomNumber1 = rand.nextInt(35) + 1;
                list.add(randomNumber1);
                Collections.sort(list);
                String list1 = list.toString();
                textView.setText("Вашите печеливши числа са:" + list1);
            }
        }

    }

}







