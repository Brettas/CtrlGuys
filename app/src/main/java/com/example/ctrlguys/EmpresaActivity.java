package com.example.ctrlguys;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ctrlguys.database.Banco;
import com.example.ctrlguys.dominio.entidades.Empresa;
import com.example.ctrlguys.dominio.repositorio.EmpresaRepositorio;

public class EmpresaActivity extends AppCompatActivity {
    private EditText ednomeEmpresa;
    private EditText edemailEmpresa;
    private EditText edCapacidadeEmpresa;
    private EditText edHorarioEmpresa;
    private EditText edSenhaEmpresa;
    private Button btnCadastrarEmpresa;

    private EmpresaRepositorio empresaReposiorio;
    private SQLiteDatabase conexao;
    private Banco banco;

    private Empresa empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_empresa);

        ednomeEmpresa = (EditText) findViewById(R.id.txt_nome_empresa);
        edemailEmpresa = (EditText) findViewById(R.id.txt_email_empresa);
        edCapacidadeEmpresa = (EditText) findViewById(R.id.txt_capacidade_empresa);
        edHorarioEmpresa = (EditText) findViewById(R.id.txt_horario_empresa);
        edSenhaEmpresa= (EditText) findViewById(R.id.txt_senha_empresa);
        btnCadastrarEmpresa = (Button) findViewById(R.id.btn_cadastrar_empresa);

        criarConexao();
    }
    public void startmainActivity2 (View view){
        Intent mainActivity2 = new Intent(this, EmpresaActivity.class);
        startActivity(mainActivity2);
    }


    public void startpessoaActivity (View view){
        Intent pessoaActivity = new Intent(this, PessoaActivity.class);
        startActivity(pessoaActivity);
    }
    public void startinfoActivity (View view){
        Intent infoActivity = new Intent(this, InfoActivity.class);
        startActivity(infoActivity);
    }

    /*Conexao Bando de Dados*/
    private void criarConexao() {

        banco = new Banco(this);
        conexao = banco.getWritableDatabase();

        empresaReposiorio = new EmpresaRepositorio(conexao);
    }
    public void cadastrarEmpresa(View vCE){
        empresaReposiorio.inserir(empresa);

        String nome = ednomeEmpresa.getText().toString();
        String email = edemailEmpresa.getText().toString();
        String capacidade = edCapacidadeEmpresa.getText().toString();
        String horario = edHorarioEmpresa.getText().toString();
        String senha = edSenhaEmpresa.getText().toString();

        empresa.nome = nome;
        empresa.email = email;
        empresa.capacidade = capacidade;
        empresa.horario = horario;
        empresa.senha = senha;
    }

}