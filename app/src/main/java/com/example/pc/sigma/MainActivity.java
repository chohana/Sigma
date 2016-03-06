package com.example.pc.sigma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int result = 0;
    int startvalue = 0;
    int lastvalue = 0;

    EditText editStartValue;
    EditText editLastValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editStartValue = (EditText)findViewById(R.id.editstartvalue);
        editLastValue = (EditText)findViewById(R.id.editlastvalue);

        Button btnStartValue = (Button)findViewById(R.id.btnstartvalue);
        btnStartValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startvalue = Integer.parseInt(editStartValue.getText().toString());
                lastvalue = Integer.parseInt(editLastValue.getText().toString());

                TextView textStartValue = (TextView)findViewById(R.id.textstartvalue);
                textStartValue.setText(mySgimaByFor(startvalue, lastvalue));
            }
        });

        Button btnLastValue = (Button)findViewById(R.id.btnlasttvalue);
        btnLastValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startvalue = Integer.parseInt(editStartValue.getText().toString());
                lastvalue = Integer.parseInt(editLastValue.getText().toString());

                TextView textLastValue = (TextView)findViewById(R.id.textlastvalue);
                textLastValue.setText(mySigmaFomula(startvalue, lastvalue));
            }
        });


    }

    public int mySgimaByFor(int startvalue, int lastvalue){

        for(int i=startvalue; i<lastvalue; i++){
            result += i;
        }

        return result;
    }

    public int mySigmaFomula(int startvalue, int lastvalue){

        result = (lastvalue - startvalue + 1) * (lastvalue + startvalue) / 2;

        return result;
    }


}
