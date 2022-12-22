package com.dio.bancoDigital.util;

import com.dio.bancoDigital.entidade.Conta;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double value, Conta contaDestino);
    void extratoBancario();
}
