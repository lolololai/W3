package com.example.administrator.w3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    String c1,c2,c3;
    EditText num1,num2,operation;
    TextView t1;
    Double x,c,v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.T1);
        num1 =(EditText)findViewById(R.id.num1);
        num2 =(EditText)findViewById(R.id.num2);
        operation =(EditText)findViewById(R.id.operation);

        c1 = String.valueOf(num1);
        c2 = String.valueOf(num2);
        c3 = String.valueOf(operation);

        x = Double.parseDouble(c1);
        c = Double.parseDouble(c2);

        b1 = (Button)findViewById(R.id.Bb1);

        BtnClick();
    }
    private void BtnClick(){
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (c3){
                    case "+" :v=x + c;
                     String.valueOf(v);
                        t1.setText("Result of " +v);
                    break;
                    case "-" :v=x - c;
                        String.valueOf(v);
                        t1.setText("Result of " +v);
                    break;
                    case "*" :v=x * c;
                        String.valueOf(v);
                        t1.setText("Result of " +v);
                    break;
                    case "/" :v=x / c;
                        String.valueOf(v);
                        t1.setText("Result of " +v);
                    break;
                    default: t1.setText("invalid operator");
                    break;
                }
            }
        });

    }
}
