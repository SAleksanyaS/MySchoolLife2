package com.SAleksanyaS.myschoollife;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class CharacterCreation extends AppCompatActivity {

    private EditText char_name;
    private EditText char_family;
    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);

// Кнопка выбор пола (Начало)
        ToggleButton button_gender = (ToggleButton) findViewById(R.id.button_gender);
        button_gender.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)  {

                    button_gender.setBackgroundResource(R.drawable.style_button_red);
                    char_name = (EditText) findViewById(R.id.char_name);
                    char_family = (EditText) findViewById(R.id.char_family);


// Кнопка "Продолжить"  Девушка (Начало)
                    button_next = (Button) findViewById(R.id.button_current_day);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try {
                                if(char_name.getText().toString().trim().equals("") | char_family.getText().toString().trim().equals("") ){
                                    Toast.makeText(CharacterCreation.this, R.string.pls_input, Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Intent intent = new Intent(CharacterCreation.this, Hold.class);
                                    intent.putExtra("char_name", char_name.getText().toString());
                                    intent.putExtra("char_family", char_family.getText().toString());
                                    startActivity(intent);
                                    finish();
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
// Кнопка "Продолжить" Девушка (Конец)
                }

                else{

                    button_gender.setBackgroundResource(R.drawable.style_button_blue);
                    char_name = (EditText) findViewById(R.id.char_name);
                    char_family = (EditText) findViewById(R.id.char_family);

// Кнопка "Продолжить" Парень (Начало)
                    button_next = (Button) findViewById(R.id.button_current_day);
                    button_next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            try {
                                if(char_name.getText().toString().trim().equals("") | char_family.getText().toString().trim().equals("") ){
                                    Toast.makeText(CharacterCreation.this, R.string.pls_input, Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Intent intent = new Intent(CharacterCreation.this, Day1.class);
                                    intent.putExtra("char_name", char_name.getText().toString());
                                    intent.putExtra("char_family", char_family.getText().toString());
                                    startActivity(intent);
                                    finish();
                                }
                            } catch (Exception e) {
                            }
                        }
                    });
// Кнопка "Продолжить" Парень (Конец)

                }
            }
        });
// Кнопка выбор пола (Конец)



// Кнопка "Назад" (Начало)
        Button button_back =(Button) findViewById(R.id.button_back_char);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(CharacterCreation.this, MainActivity.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
// Кнопка "Назад" (Конец)

    }



// Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(CharacterCreation.this, MainActivity.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
// Системная Кнопка "Назад" (Конец)

}