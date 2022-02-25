package com.dio.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
         this.numero = numero;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
