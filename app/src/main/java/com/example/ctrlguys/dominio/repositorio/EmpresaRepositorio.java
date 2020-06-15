package com.example.ctrlguys.dominio.repositorio;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.ctrlguys.dominio.entidades.Empresa;

public class EmpresaRepositorio {

    private SQLiteDatabase conexao;
    public EmpresaRepositorio(SQLiteDatabase conexao){
        this.conexao = conexao;
    }

    public void inserir(Empresa empresa){
        ContentValues contentValues = new ContentValues();
        contentValues.put("NOME",empresa.nome);
        contentValues.put("EMAIL",empresa.email);
        contentValues.put("CAPACIDADE", String.valueOf(empresa.capacidade));
        contentValues.put("LOTACAO",empresa.lotacao);
        contentValues.put("SENHA",empresa.senha);
        contentValues.put("HORARIO",empresa.horario);
    }
}
