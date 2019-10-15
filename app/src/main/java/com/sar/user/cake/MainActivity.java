package com.sar.user.cake;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    StringBuffer stringBuffer=new StringBuffer();
    int b;
    ArrayList<Integer> a;
    ArrayList<String> m;
     TextView textView;
     EditText editText;
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=new ArrayList<Integer>();
        m=new ArrayList<String>();
        textView=findViewById(R.id.textView);

        editText=findViewById(R.id.editText);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ab();
                editText.setText(null);

            }
        });






    }
    public int number()
    {
      b=(int)(Math.random()*19)+1;
        return b;
    }
    public  void  ab()
    {
        b=number();

        Log.i("hiiii",Integer.toString(b));


        if(m.contains(editText.getText().toString()))
        {
            Toast.makeText(MainActivity.this,"kitti bat lega bhai",Toast.LENGTH_SHORT).show();
            editText.setText(null);
            return;

        }
        if(a.contains(b))
            ab();
        else {
            a.add(b);
            m.add(editText.getText().toString());
            stringBuffer.append("*" + editText.getText().toString() + "==" + Integer.toString(b) + '\n');
            textView.setText(stringBuffer);
        }
    }
}
