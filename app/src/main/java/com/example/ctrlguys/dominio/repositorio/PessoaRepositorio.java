package com.example.ctrlguys.dominio.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.ctrlguys.dominio.entidades.Pessoa;

public class PessoaRepositorio {

    private SQLiteDatabase conexao;
    public PessoaRepositorio(SQLiteDatabase conexao){
        this.conexao = conexao;
    }

    public void inserir(Pessoa pessoa) {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("NOME", pessoa.nome);
        contentvalues.put("EMAIL", pessoa.email);
        contentvalues.put("SENHA", pessoa.senha);

        conexao.insertOrThrow("PESSOA", null, contentvalues);
    }
}
