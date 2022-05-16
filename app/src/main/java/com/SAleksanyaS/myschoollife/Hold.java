package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hold extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hold);


        Button hold_back = (Button) findViewById(R.id.hold_back);
        hold_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                        Intent intent = new Intent(Hold.this, MainActivity.class);
                        startActivity(intent);
                        finish();

                } catch (Exception e) {
                }
            }
        });
    }






    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Hold.this, DaysAndParts.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
    // Системная Кнопка "Назад" (Конец)
}