package LaboratorioAula10.Ex3;

public class Conta {

    private Long id;
    private Double saldo;


    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor >= saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

}
