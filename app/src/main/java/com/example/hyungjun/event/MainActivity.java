package com.example.hyungjun.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt;
    EditText etx;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.txt);
        etx = (EditText)findViewById(R.id.input);
        Button bt = (Button)findViewById(R.id.enter);
        bt.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        txt.setText(etx.getText().toString());
    }
}
