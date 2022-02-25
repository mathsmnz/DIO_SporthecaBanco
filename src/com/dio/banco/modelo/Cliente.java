package com.dio.banco.modelo;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome){
        this.nome = nome;
    }
}
