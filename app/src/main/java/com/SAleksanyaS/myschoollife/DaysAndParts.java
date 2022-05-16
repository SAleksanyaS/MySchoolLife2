package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DaysAndParts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.days);

        // Кнопка "Назад" (Начало)
        Button button_back_a =(Button) findViewById(R.id.button_back_a);
        button_back_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, MainActivity.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Назад" (Конец)






        // Кнопка "Переход на день 1" (Начало)
        TextView buttondays_1 = (TextView) findViewById(R.id.buttondays_1);
        buttondays_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Day1.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 1" (Конец)

        // Кнопка "Переход на день 2" (Начало)
        TextView buttondays_2 = (TextView) findViewById(R.id.buttondays_2);
        buttondays_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 2" (Конец)


        // Кнопка "Переход на день 3" (Начало)
        TextView buttondays_3 = (TextView) findViewById(R.id.buttondays_3);
        buttondays_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 3" (Конец)

        // Кнопка "Переход на день 4" (Начало)
        TextView buttondays_4 = (TextView) findViewById(R.id.buttondays_4);
        buttondays_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 4" (Конец)

        // Кнопка "Переход на день 5" (Начало)
        TextView buttondays_5 = (TextView) findViewById(R.id.buttondays_5);
        buttondays_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 5" (Конец)

        // Кнопка "Переход на день 6" (Начало)
        TextView buttondays_6 = (TextView) findViewById(R.id.buttondays_6);
        buttondays_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 6" (Конец)

        // Кнопка "Переход на день 7" (Начало)
        TextView buttondays_7 = (TextView) findViewById(R.id.buttondays_7);
        buttondays_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 7" (Конец)

        // Кнопка "Переход на день 8" (Начало)
        TextView buttondays_8 = (TextView) findViewById(R.id.buttondays_8);
        buttondays_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 8" (Конец)

        // Кнопка "Переход на день 9" (Начало)
        TextView buttondays_9 = (TextView) findViewById(R.id.buttondays_9);
        buttondays_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 9" (Конец)

        // Кнопка "Переход на день 10" (Начало)
        TextView buttondays_10 = (TextView) findViewById(R.id.buttondays_10);
        buttondays_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 10" (Конец)

        // Кнопка "Переход на день 11" (Начало)
        TextView buttondays_11 = (TextView) findViewById(R.id.buttondays_11);
        buttondays_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 11" (Конец)

        // Кнопка "Переход на день 12" (Начало)
        TextView buttondays_12 = (TextView) findViewById(R.id.buttondays_12);
        buttondays_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Hold.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 12" (Конец)



    }








    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(DaysAndParts.this, CharacterCreation.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
    // Системная Кнопка "Назад" (Конец)
}