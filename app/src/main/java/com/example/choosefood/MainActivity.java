package com.example.choosefood;

import java.lang.String;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //static final int foodsize=6;//size for food
    //String[] foodcontent=new String[foodsize];
    static int size=20;
    public void generate(View v) {     // 按钮对应的 onclick 响应
        //(TextView) findViewById(R.id.txv);  // 根据ID找到对应的text对象
        Random r=new Random();
        int get=r.nextInt(6)+1;
        EditText name;
        switch(get)
        {
            case 1:
                name=(EditText) findViewById(R.id.food1);
                break;
            case 2:
                name=(EditText) findViewById(R.id.food2);
                break;
            case 3:
                name=(EditText) findViewById(R.id.food3);
                break;
            case 4:
                name=(EditText) findViewById(R.id.food4);
                break;
            case 5:
                name=(EditText) findViewById(R.id.food5);
                break;
            default:
                name=(EditText) findViewById(R.id.food6);
                break;
        }
        name.setTextSize(size+5);
        //name.setTextColor(0xffffff);

    }

    public void clear(View v) {     // 按钮对应的 onclick 响
        EditText name;
        name=(EditText) findViewById(R.id.food1);
        name.setTextSize(size);
        name=(EditText) findViewById(R.id.food2);
        name.setTextSize(size);
        name=(EditText) findViewById(R.id.food3);
        name.setTextSize(size);
        name=(EditText) findViewById(R.id.food4);
        name.setTextSize(size);
        name=(EditText) findViewById(R.id.food5);
        name.setTextSize(size);
        name=(EditText) findViewById(R.id.food6);
        name.setTextSize(size);
    }


}