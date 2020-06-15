package com.example.ctrlguys;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ctrlguys.database.Banco;
import com.example.ctrlguys.dominio.entidades.Pessoa;
import com.example.ctrlguys.dominio.repositorio.PessoaRepositorio;

public class PessoaActivity extends AppCompatActivity {
    private EditText ednomePessoa;
    private EditText edemailPessoa;
    private EditText edsenhaPessoa;
    private Button btn_cadastrarPessoa;

    private PessoaRepositorio pessoarepositorio;

    private SQLiteDatabase conexao;
    private Banco banco;

    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);

        ednomePessoa = (EditText) findViewById(R.id.txt_nome_pessoa);
        edemailPessoa = (EditText) findViewById(R.id.txt_email_pessoa);
        edsenhaPessoa = (EditText) findViewById(R.id.txt_senha_pessoa);
        btn_cadastrarPessoa = (Button) findViewById(R.id.btn_cadastrar_pessoa);

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
        pessoarepositorio = new PessoaRepositorio(conexao);
    }
    public void cadastrarPessoa(View vCP){
        pessoarepositorio.inserir(pessoa);

        String nome = ednomePessoa.getText().toString();
        String email = edemailPessoa.getText().toString();
        String senha = edsenhaPessoa.getText().toString();

        pessoa.nome = nome;
        pessoa.email = email;
        pessoa.senha = senha;
    }

}