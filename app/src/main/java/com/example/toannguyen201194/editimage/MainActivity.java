package com.example.toannguyen201194.editimage;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton action_btncamera,action_btnphoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        action_btncamera=(FloatingActionButton) findViewById(R.id.action_btncamera);
        action_btnphoto=(FloatingActionButton) findViewById(R.id.action_btnphoto);
        action_btnphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"aaaaaaa",Toast.LENGTH_LONG).show();
            }
        });


    }
}
