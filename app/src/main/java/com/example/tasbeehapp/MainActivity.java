package com.example.tasbeehapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
//Zain_Shakoor
// AU24

public class MainActivity extends AppCompatActivity {
        Button bt1,bt2,bt3,bt4,bt5,reset,Counter;
        TextView tv1,tv2;
        int count=0;
        String name;
        int reset1=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt3=(Button) findViewById(R.id.bt3);
        bt4=(Button) findViewById(R.id.bt4);
        bt5=(Button) findViewById(R.id.bt5);
        reset=(Button) findViewById(R.id.reset);
        Counter=(Button) findViewById(R.id.counter);
        tv1=(TextView) findViewById(R.id.SelectTasbeeh);
        tv2=(TextView) findViewById(R.id.DisplayCount);

        Toast.makeText(this, name ,Toast.LENGTH_SHORT).show();




        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                String num=Integer.toString(count);
                tv2.setText(num);
                tv1.setText("Select Tasbeeh");



            }
        });


        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count=0;
             String num=Integer.toString(count);
             tv2.setText(num);
             count=0;
                Toast.makeText(MainActivity.this, "Select Tasbeeh", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void bt1(View view) {
        Toast.makeText(this, "Tasbeeh Fatima Selected", Toast.LENGTH_SHORT).show();
        tv1.setText("Alhumdulilah");
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = Integer.toString(reset1);
                tv2.setText(num1);
                count++;
                String num = Integer.toString(count);
                tv2.setText(num);
                if (count == 33) {
                    tv1.setText("Alhumdulilah");
                    tv2.setText(num1);
                    count=0;
                }

                if (count==0)
            {
                        tv1.setText("ALLAH O Akbar");

                    }


            }
        });



    }

    public void kalima(View view) {
        count=0;
        Toast.makeText(this, "1st Kalma Selected", Toast.LENGTH_SHORT).show();
        tv1.setText("1st Kalma 100 Times");
        count=0;
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                String num=Integer.toString(count);
                tv2.setText(num);

            }
        });



    }

    public void Astagfhar(View view) {
        count=0;
        Toast.makeText(this, "Astagfar Selected ", Toast.LENGTH_SHORT).show();
        tv1.setText("Astagfar 100 Times");
        count=0;
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                String num=Integer.toString(count);
                tv2.setText(num);

            }
        });


    }

    public void Daruud(View view) {
        count=0;
        Toast.makeText(this, "Daruud Selected ", Toast.LENGTH_SHORT).show();
        tv1.setText("Daruud 100 Times");
        count=0;
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                String num=Integer.toString(count);
                tv2.setText(num);

            }
        });


    }

    public void Ayete(View view) {
        count=0;
        Toast.makeText(this, "Ayete Karima Selected ", Toast.LENGTH_SHORT).show();
        tv1.setText("Aytee Karima 100 Times");
        count=0;
        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                String num=Integer.toString(count);
                tv2.setText(num);

            }
        });

    }
}

