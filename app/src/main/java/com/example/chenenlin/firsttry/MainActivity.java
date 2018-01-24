package com.example.chenenlin.firsttry;

import android.support.v7.app.AppCompatActivity;
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


    public void press(View v){
        EditText txtInput = (EditText) findViewById(R.id.txtInput);
        TextView lblOutput = (TextView) findViewById(R.id.lblOutput);

        lblOutput.setText(txtInput.getText().toString());

    }

}
