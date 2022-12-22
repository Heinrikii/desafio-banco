package com.dio.bancoDigital.entidade;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoBancario() {
        System.out.println("===== Extrato Conta Poupança =====");
        super.imprimirInfosComuns();
    }
}
