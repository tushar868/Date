package com.example.date3;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=(DatePicker)findViewById(R.id.datepicker);
        Calendar cal=Calendar.getInstance();
        int year=cal.get(cal.YEAR);
        int month=cal.get(cal.MONTH);
        int day=cal.get(cal.DAY_OF_MONTH);
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+"_"+datePicker.getMonth()+"_"+datePicker.getYear(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}


