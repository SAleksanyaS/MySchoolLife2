package com.SAleksanyaS.myschoollife;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private  Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_memory = (Button)findViewById(R.id.button_memory);
        Button button_current_day = (Button)findViewById(R.id.button_current_day);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyCharPrefs", Context.MODE_PRIVATE);
        String txtgender = sp.getString("gender", "");

// Кнопка "Начать игру" (Начало)
        Button buttonStartovoe = (Button)findViewById(R.id.button_new_game);
        buttonStartovoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sp.edit().clear().commit();
                    Intent intent = new Intent(MainActivity.this, CharacterCreation.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
// Кнопка "Начать" (Конец)




// Кнопка "Воспоминания" (Начало)
        button_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(txtgender.equals("m") | txtgender.equals("w")) {
                        Intent intent = new Intent(MainActivity.this, Days.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Начните новую игру", Toast.LENGTH_SHORT).show();
                    }

                } catch (Exception e) {
                }
            }
        });
// Кнопка "Воспоминания" (Конец)



// Кнопка "Продолжить игру" (Начало)
        button_current_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, Days.class); //////////////////  перенос на дейст уровень
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
// Кнопка "Продолжить игру" (Конец)

    }



// Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){

        if(backPressedTime + 3000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else{
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти",Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
// Системная Кнопка "Назад"  (Конец)

}