package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Day2_man extends AppCompatActivity {
    private TextView char_name, char_family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_man);


        TextView day2_teacher_1_1 = (TextView) findViewById(R.id.day2_teacher_1_1);
        TextView day2_teacher_1_2 = (TextView) findViewById(R.id.day2_teacher_1_2);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyCharPrefs", Context.MODE_PRIVATE);
        String txtname = sp.getString("charname", "");
        String txtfamily = sp.getString("charfamily", "");

        day2_teacher_1_1.setText(day2_teacher_1_1.getText().toString() + " " + txtname + day2_teacher_1_2.getText().toString());


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }




    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Day2_man.this, Days.class);   //переход с одной активити к дпугой
            startActivity(intent);finish();

        } catch (Exception ignored) {
        }
    }
// Системная Кнопка "Назад" (Конец)

}