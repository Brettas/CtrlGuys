package com.example.ctrlguys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class empresa_Activity extends AppCompatActivity {
    private EditText ednomeEmpresa;
    private EditText edemailEmpresa;
    private EditText edCapacidadeEmpresa;
    private EditText edHorarioEmpresa;
    private EditText edSenhaEmpresa;
    private Button btn_cadastar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_empresa);

        ednomeEmpresa = (EditText) findViewById(R.id.txt_nome_empresa);
        edemailEmpresa = (EditText) findViewById(R.id.txt_email_empresa);
        edCapacidadeEmpresa = (EditText) findViewById(R.id.txt_capacidade_empresa);
        edHorarioEmpresa = (EditText) findViewById(R.id.txt_horario_empresa);
        edSenhaEmpresa= (EditText) findViewById(R.id.txt_senha_empresa);
        btn_cadastar = (Button) findViewById(R.id.btn_cadastrar_empresa);
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