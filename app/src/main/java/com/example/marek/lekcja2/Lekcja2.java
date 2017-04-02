package com.example.marek.lekcja2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Lekcja2 extends Activity{
    TextView text1;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    EditText name;
    EditText surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lekcja2);

        text1 = (TextView) findViewById(R.id.textView2);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        name = (EditText) findViewById(R.id.editText);
        surname = (EditText) findViewById(R.id.editText2);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Przycisk 1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Przycisk 2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Przycisk 3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView4);

                name.getText();
                surname.getText();
                textView.setText(name.getText()+" "+surname.getText());
            }
        });
    }
}
