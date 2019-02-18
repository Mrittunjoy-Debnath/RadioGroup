package com.example.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button2;
    RadioButton genderradioButton,genderradioButton2;
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    int total=0;
    TextView showTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup2=(RadioGroup)findViewById(R.id.radioGroup2);
        showTextView=findViewById(R.id.textViewId);
    }
    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        genderradioButton = (RadioButton) findViewById(selectedId);

        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else if(selectedId==R.id.answer1){
            Toast.makeText(MainActivity.this,"right\n"+genderradioButton.getText(), Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this,"Marks +1 :total :"+ ++total, Toast.LENGTH_SHORT).show();
            showTextView.setText("Marks "+total);
        }

    }
    public void onclickbuttonMethod2(View v){
        int selectedId = radioGroup2.getCheckedRadioButtonId();
        genderradioButton2 = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else if(selectedId==R.id.answer22){
            Toast.makeText(MainActivity.this,"right\n"+genderradioButton2.getText(), Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this,"Marks +1 :total :"+ ++total, Toast.LENGTH_SHORT).show();
            showTextView.setText("Marks "+total);
        }

    }
}