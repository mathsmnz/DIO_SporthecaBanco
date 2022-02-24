package com.dio.banco.modelo.conta;

import com.dio.banco.IConta;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    private void setNumero(int numero) {
        this.numero = numero;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(){
        setAgencia(AGENCIA_PADRAO);
        setNumero(SEQUENCIAL++);
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor){
            this.setSaldo(getSaldo() - valor);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo() + valor);
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        if(sacar(valor)){
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    protected void imprimirInfosComuns(){
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Numero: %d%n", getNumero());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }
}
