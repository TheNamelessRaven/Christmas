package com.example.calendarychristmasedition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView day1,day2,day3,day4,day5,day6,day7,day8,day9,day10,day11,day12,day13,day14,
    day15,day16,day17,day18,day19,day20,day21,day22,day23,day24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day1.setImageResource(R.drawable.first);
            }
        });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day2.setImageResource(R.drawable.second);
            }
        });
        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day3.setImageResource(R.drawable.third);
            }
        });
        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day4.setImageResource(R.drawable.fourth);
            }
        });
        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day5.setImageResource(R.drawable.fifth);
            }
        });
        day6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day6.setImageResource(R.drawable.sixth);
            }
        });
        day7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day7.setImageResource(R.drawable.seventh);
            }
        });
        day8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day8.setImageResource(R.drawable.eight);
            }
        });
        day9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day9.setImageResource(R.drawable.nine);
            }
        });
        day10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day10.setImageResource(R.drawable.ten);
            }
        });
        day11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day11.setImageResource(R.drawable.eleven);
            }
        });
        day12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day12.setImageResource(R.drawable.twelve);
            }
        });
        day13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day13.setImageResource(R.drawable.thirtheen);
            }
        });
        day14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day14.setImageResource(R.drawable.fourteen);
            }
        });
        day15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day15.setImageResource(R.drawable.fifteen);
            }
        });
        day16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day16.setImageResource(R.drawable.sixteen);
            }
        });
        day17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day17.setImageResource(R.drawable.seventeen);
            }
        });
        day18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day18.setImageResource(R.drawable.eighteen);
            }
        });
        day19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day19.setImageResource(R.drawable.nineteen);
            }
        });
        day20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day20.setImageResource(R.drawable.twenty);
            }
        });
        day21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day21.setImageResource(R.drawable.twentyone);
            }
        });
        day22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day22.setImageResource(R.drawable.twentytwo);
            }
        });
        day23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day23.setImageResource(R.drawable.twentythree);
            }
        });
        day24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day24.setImageResource(R.drawable.twentyfour);
            }
        });

    }
    private void init(){
        day1=findViewById(R.id.day1);
        day2=findViewById(R.id.day2);
        day3=findViewById(R.id.day3);
        day4=findViewById(R.id.day4);
        day5=findViewById(R.id.day5);
        day6=findViewById(R.id.day6);
        day7=findViewById(R.id.day7);
        day8=findViewById(R.id.day8);
        day9=findViewById(R.id.day9);
        day10=findViewById(R.id.day10);
        day11=findViewById(R.id.day11);
        day12=findViewById(R.id.day12);
        day13=findViewById(R.id.day13);
        day14=findViewById(R.id.day14);
        day15=findViewById(R.id.day15);
        day16=findViewById(R.id.day16);
        day17=findViewById(R.id.day17);
        day18=findViewById(R.id.day18);
        day19=findViewById(R.id.day19);
        day20=findViewById(R.id.day20);
        day21=findViewById(R.id.day21);
        day22=findViewById(R.id.day22);
        day23=findViewById(R.id.day23);
        day24=findViewById(R.id.day24);


    }
}