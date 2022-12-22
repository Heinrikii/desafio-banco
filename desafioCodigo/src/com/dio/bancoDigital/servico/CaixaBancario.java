package com.dio.bancoDigital.servico;

import com.dio.bancoDigital.entidade.Cliente;
import com.dio.bancoDigital.entidade.Conta;
import com.dio.bancoDigital.entidade.ContaCorrente;
import com.dio.bancoDigital.entidade.ContaPoupanca;

public class CaixaBancario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Henrique");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(1000d);
        cc.transferir(550.50,poupanca);

        cc.extratoBancario();
        poupanca.extratoBancario();

    }
}
