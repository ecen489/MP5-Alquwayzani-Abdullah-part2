package com.example.mp5part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class capitals extends AppCompatActivity {
    public EditText ET;public int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitals);
        ET = (EditText) findViewById(R.id.editText);
        Intent intent= getIntent();
        score = intent.getIntExtra("score",-1);
    }
    public void answer(View view){
        Intent intent = new Intent();
        if (ET.getText().toString().equals("Paris")||ET.getText().toString().equals("PARIS")||
                ET.getText().toString().equals("paris")){
            score=score+1;
            intent.putExtra("score",(int) (score));
            setResult(1,intent);
            finish();
        }else{
        intent.putExtra("score",(int) score);
        setResult(987,intent);
        finish();
        }
    }
}

