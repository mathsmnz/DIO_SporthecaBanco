package com.dio.banco.modelo.conta;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
}
