package com.dio.banco.modelo.conta;

import com.dio.banco.modelo.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(Cliente cliente, int agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
}
