package com.dio.banco;

import com.dio.banco.modelo.conta.Conta;
import com.dio.banco.modelo.conta.ContaCorrente;
import com.dio.banco.modelo.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
