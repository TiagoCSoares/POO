package Laboratorio13.Ex2;

import Laboratorio13.Ex2.Exceptions.ExcecaoChequeEspecial;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    public void sacar(double valor) throws ExcecaoChequeEspecial {
        try {
            if (this.saldo + this.chequeEspecial > valor) {
                this.saldo -= valor;
            }
        } catch (Exception e) {
            String message;
            if(this.chequeEspecial == 0) {
                message = ("Saldo insuficiente no" +
                        " cheque especial" + (valor - saldo));
            }
            else
                message = ("Não há cheque especial" +
                        (valor - (saldo + chequeEspecial)));
            throw new ExcecaoChequeEspecial(message, valor - (saldo + chequeEspecial));
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


}