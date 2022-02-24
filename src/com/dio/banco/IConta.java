package com.dio.banco;

import com.dio.banco.modelo.conta.Conta;

public interface IConta {
    boolean sacar(double valor);
    void depositar(double valor);
    boolean transferir(double valor, Conta destino);
    void imprimirExtrato();
}
