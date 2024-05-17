package Laboratorio13.Ex2;

import Laboratorio13.Ex2.Exceptions.ExcecaoChequeEspecial;

public class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial {
        try {
            if((this.saldo - valor) > 0 ) {
                saldo = saldo - valor;
            }
        } catch (Exception e){
            throw new ExcecaoChequeEspecial("Saldo insuficiente", valor - saldo);
        }

    }


}