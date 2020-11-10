package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;

public class reservation_one extends AppCompatActivity {

    private CalendarView cal_one;
    private TimePicker timepicker_one;
    private Button btn_reservation_start, btn_reservation_stop,btn_reservation_next, btn_reservation_end;
    private int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_one);

        cal_one = (CalendarView)findViewById(R.id.cal_one);
        timepicker_one = (TimePicker)findViewById(R.id.timepicker_one);
        btn_reservation_start = (Button) findViewById(R.id.btn_reservation_start);
        btn_reservation_stop = (Button) findViewById(R.id.btn_reservation_stop);
        btn_reservation_next = (Button) findViewById(R.id.btn_reservation_next);
        btn_reservation_end = (Button)findViewById(R.id.btn_reservation_end);

        cal_one.setVisibility(View.INVISIBLE);
        timepicker_one.setVisibility(View.INVISIBLE);
        btn_reservation_stop.setVisibility(View.INVISIBLE);
        btn_reservation_next.setVisibility(View.INVISIBLE);
        btn_reservation_end.setVisibility(View.INVISIBLE);

        btn_reservation_start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cal_one.setVisibility(View.VISIBLE);
                btn_reservation_stop.setVisibility(View.VISIBLE);
                btn_reservation_next.setVisibility(View.VISIBLE);
            }
        });

        btn_reservation_stop.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cal_one.setVisibility(View.INVISIBLE);
                timepicker_one.setVisibility(View.INVISIBLE);
                btn_reservation_stop.setVisibility(View.INVISIBLE);
                btn_reservation_next.setVisibility(View.INVISIBLE);
                btn_reservation_end.setVisibility(View.INVISIBLE);
            }
        });

        cal_one.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month+1;
                selectDay = dayOfMonth;
            }
        });

        btn_reservation_next.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                btn_reservation_next.setVisibility(View.INVISIBLE);
                cal_one.setVisibility(View.INVISIBLE);
                btn_reservation_end.setVisibility(View.VISIBLE);
                timepicker_one.setVisibility(View.VISIBLE);
            }
        });

        btn_reservation_end.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


             Intent intent = new Intent(reservation_one.this,LoginActivity.class);
                intent.putExtra("day",Integer.toString(selectDay));
                intent.putExtra("month",Integer.toString(selectMonth));
                intent.putExtra("year",Integer.toString(selectYear));
                intent.putExtra("hour",Integer.toString(timepicker_one.getCurrentHour()));
                intent.putExtra("minute",Integer.toString(timepicker_one.getCurrentMinute()));
                Toast.makeText(reservation_one.this, "예약이 완료되었습니다.",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });


    }
}
