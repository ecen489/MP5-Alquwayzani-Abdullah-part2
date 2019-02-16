package com.example.mp5part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class math extends AppCompatActivity {
    EditText ET;int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        ET = (EditText) findViewById(R.id.editText60);
        Intent intent= getIntent();
        score = intent.getIntExtra("score",0);
    }
    public void answer(View view){
        Intent intent = new Intent();
        if (ET.getText().toString().equals("75")){
            intent.putExtra("score",score+1);
            setResult(1,intent);
            finish();
        }else {
            intent.putExtra("score", score);
            setResult(0, intent);
            finish();
        }
    }
}
