package com.dio.banco.modelo.conta;

import com.dio.banco.modelo.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente(Cliente cliente, int agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }
}
