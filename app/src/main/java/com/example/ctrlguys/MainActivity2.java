package com.example.ctrlguys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos_login);
    }
    public void startmainActivity2 (View view){
        Intent mainActivity2 = new Intent(this, empresa_Activity.class);
        startActivity(mainActivity2);
    }


    public void startpessoaActivity (View view){
        Intent pessoaActivity = new Intent(this, pessoaActivity.class);
        startActivity(pessoaActivity);
    }
    public void startinfoActivity (View view){
        Intent infoActivity = new Intent(this, infoActivity.class);
        startActivity(infoActivity);
    }

}