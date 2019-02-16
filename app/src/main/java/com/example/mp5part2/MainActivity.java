package com.example.mp5part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.*;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView TV;public int score;public ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV=(TextView) findViewById(R.id.textView1);
        LV=(ListView) findViewById(R.id.listView);
       // TV.setText(Integer.toString(score));
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent;
                switch(position) {
                    case 0:
                        intent = new Intent(MainActivity.this, capitals.class);
                        intent.putExtra("score",(int) (score));
                        startActivityForResult(intent,503);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, math.class);
                        intent.putExtra("score",(int) score);
                        startActivityForResult(intent,503);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, flags.class);
                        intent.putExtra("score",(int) score);
                        startActivityForResult(intent,503);
                        break;
                }

            }
        };
        LV.setOnItemClickListener(itemClickListener);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
            score= intent.getIntExtra("score",-8);
            TV.setText("99");
            TV.setText(Integer.toString(score));
    }
    public void reset(View view){
        score=0;
        TV.setText(Integer.toString(score));
    }
}
