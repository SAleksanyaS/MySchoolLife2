package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Day1 extends AppCompatActivity {

    Dialog dialog;
    Dialog dialog_test;

    private TextView char_name;
    private TextView char_family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1);



        String txtname = getIntent().getStringExtra("char_name");
        String txtfamily = getIntent().getStringExtra("char_family");
// принимаем имя и фамилию из CharacterCreation

//



// диалоговое окно привью (Начало)
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);     // скрыть заголовок кода
        dialog.setContentView(R.layout.privie);   // путь к диалоговому окну
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT))); // прозрачный фон
        dialog.setCancelable(false); // окно нельзя закрыть назад
        dialog.show();  // показать диалоговое окно



// кнопка закрыть привью (Начало)  //
        TextView btclose = (TextView) dialog.findViewById(R.id.btn_close_privie);
        btclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Day1.this, DaysAndParts.class);
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



// объявление кнопок
        ImageView kartinka = (ImageView) findViewById(R.id.day_1_kartinka);
        Button day1_son =(Button) findViewById(R.id.day_1_sleep);
        Button day1_up =(Button) findViewById(R.id.day_1_awake);
        Button day1_next =(Button) findViewById(R.id.day1_next);
        Button go_test =(Button) findViewById(R.id.test_start);
        Button go_nextday =(Button) findViewById(R.id.btngo_day2);

        day1_son.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    day1_next.setVisibility(View.VISIBLE);
                    day1_son.setVisibility(View.INVISIBLE);
                    day1_up.setVisibility(View.INVISIBLE);
                    kartinka.setImageResource(R.drawable.day1_scr2_2_ru);

                } catch (Exception e) {
                }
            }
        });

        day1_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    day1_next.setVisibility(View.VISIBLE);
                    day1_son.setVisibility(View.INVISIBLE);
                    day1_up.setVisibility(View.INVISIBLE);
                    kartinka.setImageResource(R.drawable.day1_scr2_1_ru);
                } catch (Exception e) {
                }
            }
        });

        day1_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    day1_next.setVisibility(View.INVISIBLE);
                    go_test.setVisibility(View.VISIBLE);
                    kartinka.setImageResource(R.drawable.day1_scr3_ru);
                } catch (Exception e) {
                }
            }
        });


        go_test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    dialog_test = new Dialog(Day1.this);
                    dialog_test.requestWindowFeature(Window.FEATURE_NO_TITLE);     // скрыть заголовок кода
                    dialog_test.setContentView(R.layout.day1_test);   // путь к диалоговому окну
                    dialog_test.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT))); // прозрачный фон
                    dialog_test.setCancelable(false); // окно нельзя закрыть назад
                    dialog_test.show(); // показать диалоговое окно


                    kartinka.setImageResource(R.drawable.day1_scr4_ru);
                    go_test.setVisibility(View.INVISIBLE);
                    go_nextday.setVisibility(View.VISIBLE);



                    TextView char_name = (TextView) dialog_test.findViewById(R.id.test_char_name);
                    TextView char_family = (TextView) dialog_test.findViewById(R.id.test_char_family);
                    char_name.setText(char_name.getText().toString() + " " + txtname);
                    char_family.setText(char_family.getText().toString() + " " + txtfamily);


                    Button test_end = (Button) dialog_test.findViewById(R.id.test_end);
                    test_end.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try {
                                dialog_test.dismiss();
                            }catch (Exception e){
                            }
                        }
                    });


                } catch (Exception e) {
                }
            }
        });

        go_nextday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Day1.this, Hold.class);
                    startActivity(intent);finish();
                }catch (Exception e){
                }
            }
        });

    }



// Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Day1.this, DaysAndParts.class);   //переход с одной активити к дпугой
            startActivity(intent);finish();

        } catch (Exception ignored) {
        }
    }
// Системная Кнопка "Назад" (Конец)

}