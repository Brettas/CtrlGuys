package com.example.ctrlguys.database;

public class ScripSQL {

    public static String getCreateTablePessoa(){
        StringBuilder sql = new StringBuilder();

        sql.append(";   CREATE TABLE PESSOA (");
        sql.append(" id INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT ,");
        sql.append("nome VARCHAR(40)  NOT NULL  ,");
        sql.append("email VARCHAR(25)  NOT NULL  ,");
        sql.append("senha VARCHAR(16)  NOT NULL    ,");

        return sql.toString();
    }

    public static String getCreateTableEmpresa(){
        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE EMPRESA(");
        sql.append("id INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT  ,");
        sql.append("nome VARCHAR(40)  NOT NULL  ,");
        sql.append("email VARCHAR(30)  NOT NULL  ,");
        sql.append("capacidade INTEGER  NOT NULL  ,");
        sql.append("lotacao INTEGER,");
        sql.append("senha VARCHAR(16)  NOT NULL  ,");
        sql.append("horario VARCHAR(16)      ,");

        return  sql.toString();



    }
}






















