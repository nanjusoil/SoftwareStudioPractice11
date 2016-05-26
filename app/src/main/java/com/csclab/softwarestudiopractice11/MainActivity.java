package com.csclab.softwarestudiopractice11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (Button)findViewById(R.id.button);
        edt = (EditText)findViewById(R.id.editText);
        /** To Do:
         * (1) Find the UI element on xml file
         * **/


        send.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                sendName();
            }
        });

    }

    public void sendName(){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Activity2.class);
        Bundle bundle = new Bundle();
/* Put the information in bundle */
        bundle.putString("name", String.valueOf(edt.getText()));
        intent.putExtras(bundle); // Pass bundle to intent
        startActivity(intent);
        /** To Do:
         * (1) Use intent and Bundle to pass string
         * (2) Change activity to Activity2
         * **/


    }



}
