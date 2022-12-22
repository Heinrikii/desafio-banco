package com.dio.bancoDigital.entidade;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoBancario() {
        System.out.println("===== Extrato Conta Corrente =====");
        super.imprimirInfosComuns();
    }
}
