package com.example.percents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edtP,edtN;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN = (EditText) findViewById(R.id.edtN);
        edtP = (EditText) findViewById(R.id.edtP);
        btn = (Button) findViewById(R.id.btn);
        tv = (TextView) findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(edtP.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(edtN.getText().toString());
                tv.setText(Float.toString(total));


            }
        });
    }
}
