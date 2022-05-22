package com.SAleksanyaS.myschoollife;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Days extends AppCompatActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.days);

        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);     // скрыть заголовок кода
        dialog.setContentView(R.layout.privie_days);   // путь к диалоговому окну
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT))); // прозрачный фон
        dialog.setCancelable(false); // окно нельзя закрыть назад
        dialog.show();  // показать диалоговое окно

        // кнопка закрыть привью (Начало)  //
        TextView btclose = (TextView) dialog.findViewById(R.id.btn_close_privie);
        btclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Days.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){
                }
                dialog.dismiss();
            }
        });
// кнопка закрыть привью (Конец)



// кнопка продолжить игру (Начало)
        Button btncont = (Button)dialog.findViewById(R.id.btn_next_privie);
        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
// кнопка продолжить игру (Конец)
// диалоговое окно привью (Конец)  //


        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyCharPrefs", Context.MODE_PRIVATE);
        String txtgender = sp.getString("gender", "");
        final int night = sp.getInt("Night", 1);

// Кнопка "Назад" (Начало)
        Button button_back_a =(Button) findViewById(R.id.button_back_days);
        button_back_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Days.this, MainActivity.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
// Кнопка "Назад" (Конец)


        TextView buttondays_1 = (TextView) findViewById(R.id.buttondays_1);
        TextView buttondays_2 = (TextView) findViewById(R.id.buttondays_2);
        TextView buttondays_3 = (TextView) findViewById(R.id.buttondays_3);
        TextView buttondays_4 = (TextView) findViewById(R.id.buttondays_4);
        TextView buttondays_5 = (TextView) findViewById(R.id.buttondays_5);
        TextView buttondays_6 = (TextView) findViewById(R.id.buttondays_6);
        TextView buttondays_7 = (TextView) findViewById(R.id.buttondays_7);
        TextView buttondays_8 = (TextView) findViewById(R.id.buttondays_8);
        TextView buttondays_9 = (TextView) findViewById(R.id.buttondays_9);
        TextView buttondays_10 = (TextView) findViewById(R.id.buttondays_10);
        TextView buttondays_11 = (TextView) findViewById(R.id.buttondays_11);
        TextView buttondays_12 = (TextView) findViewById(R.id.buttondays_12);





        if(txtgender.equals("m")) {
// Кнопка "Переход на день 1" (Начало)
            buttondays_1.setBackgroundResource(R.drawable.levelsbutton);
            if(night > 0){
                buttondays_1.setBackgroundResource(R.drawable.style_button_green);
            }
            buttondays_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if(night >= 0){
                        Intent intent = new Intent(Days.this, Day1_man.class);
                        startActivity(intent);
                        finish();
                        }
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 1" (Конец)

            buttondays_2.setBackgroundResource(R.drawable.levelsbutton);
            if(night > 1){
                buttondays_1.setBackgroundResource(R.drawable.style_button_green);
            }
// Кнопка "Переход на день 2" (Начало)
            buttondays_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if(night >= 1){
                            Intent intent = new Intent(Days.this, Day2_man.class);
                            startActivity(intent);
                            finish();
                        }
                        else {
                            Toast.makeText(Days.this, "Необходми пройти уровень 1", Toast.LENGTH_SHORT).show();
                        }
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 2" (Конец)


// Кнопка "Переход на день 3" (Начало)
            buttondays_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 3" (Конец)


// Кнопка "Переход на день 4" (Начало)
            buttondays_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 4" (Конец)


// Кнопка "Переход на день 5" (Начало)
            buttondays_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 5" (Конец)


// Кнопка "Переход на день 6" (Начало)
            buttondays_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 6" (Конец)


// Кнопка "Переход на день 7" (Начало)
            buttondays_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 7" (Конец)


// Кнопка "Переход на день 8" (Начало)
            buttondays_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 8" (Конец)


// Кнопка "Переход на день 9" (Начало)
            buttondays_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 9" (Конец)


// Кнопка "Переход на день 10" (Начало)
            buttondays_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 10" (Конец)


// Кнопка "Переход на день 11" (Начало)
            buttondays_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 11" (Конец)


// Кнопка "Переход на день 12" (Начало)
            buttondays_12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 12" (Конец)
        }


        if(txtgender.equals("w")) {
// Кнопка "Переход на день 1" (Начало)
            buttondays_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 1" (Конец)


// Кнопка "Переход на день 2" (Начало)
            buttondays_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 2" (Конец)


// Кнопка "Переход на день 3" (Начало)
            buttondays_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 3" (Конец)


// Кнопка "Переход на день 4" (Начало)
            buttondays_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 4" (Конец)


// Кнопка "Переход на день 5" (Начало)
            buttondays_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 5" (Конец)


// Кнопка "Переход на день 6" (Начало)
            buttondays_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 6" (Конец)


// Кнопка "Переход на день 7" (Начало)
            buttondays_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 7" (Конец)


// Кнопка "Переход на день 8" (Начало)
            buttondays_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 8" (Конец)


// Кнопка "Переход на день 9" (Начало)
            buttondays_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 9" (Конец)


// Кнопка "Переход на день 10" (Начало)
            buttondays_10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 10" (Конец)


// Кнопка "Переход на день 11" (Начало)
            buttondays_11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 11" (Конец)


// Кнопка "Переход на день 12" (Начало)
            buttondays_12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Intent intent = new Intent(Days.this, Hold.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {
                    }
                }
            });
// Кнопка "Переход на день 12" (Конец)
        }




    }



// Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Days.this, CharacterCreation.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
// Системная Кнопка "Назад" (Конец)

}