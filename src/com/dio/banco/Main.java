package com.dio.banco;

import com.dio.banco.modelo.Banco;
import com.dio.banco.modelo.Cliente;
import com.dio.banco.modelo.conta.Conta;
import com.dio.banco.modelo.conta.ContaCorrente;
import com.dio.banco.modelo.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Agencia Simonne", 1569);
        Cliente cliente = new Cliente("Marcos");

        Conta cc = new ContaCorrente(cliente, banco.getNumero());
        Conta cp = new ContaPoupanca(cliente, banco.getNumero());

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
