package com.SAleksanyaS.myschoollife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class CharacterCreation extends AppCompatActivity {

   // public static String person_name;
   // public static String person_family;


    private EditText char_name;
    private EditText char_family;
    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);



// Кнопка выбор пола (Начало)
        ToggleButton button_Man = (ToggleButton) findViewById(R.id.button_Man);
        button_Man.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)  {
                    // Your code
                } else {
                    // Your code
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



/*
// Запись имени (Начало)
        //final EditText editText_name = findViewById(R.id.PersonName);
        editText_name.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    сохраняем текст, введённый до нажатия Enter в переменную
                    person_name = editText_name.getText().toString();
                    System.out.println(person_name);
                    return true;
                }
                return false;
            }
        }
        );
// Запись имени (Конец)



// Запись фамилии (Начало)
        final EditText editText_family = findViewById(R.id.PersonFamily);
        editText_family.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // сохраняем текст, введённый до нажатия Enter в переменную
                    person_family = editText_family.getText().toString();
                    System.out.println(person_family);
                    return true;
                }
                return false;
            }
        }
        );
// Запись фамилии (Конец)
*/




        char_name = (EditText) findViewById(R.id.char_name);
        char_family = (EditText) findViewById(R.id.char_family);



// Кнопка "Продолжить" (Начало)
        button_next = (Button) findViewById(R.id.button_next_char);
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
// Кнопка "Продолжить" (Конец)

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