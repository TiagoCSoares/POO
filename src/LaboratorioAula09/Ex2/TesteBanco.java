package LaboratorioAula09.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();

        double saldoInicial = scanner.nextDouble();
        Conta contaBrunoH = new Conta(saldoInicial);
        contaBrunoH.sacar(1200);
        contaBrunoH.depositar(8525);
        contaBrunoH.sacar(12800);
        contaBrunoH.sacar(50000);
        System.out.println(contaBrunoH.getSaldo());

        Cliente cliente = new Cliente("Bruno","Henrique");
        cliente.setConta(contaBrunoH);

        Conta conta = cliente.getConta();
    }


    public void opcoes(List<Cliente> clientes, List<Conta> contas) {
        System.out.println("""
                1 - Criar cliente
                2 - Criar conta
                3 - Associar conta a cliente
                4 - Sacar
                5 - Depositar
                0 - sair
                """);

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
            String nome = scanner.nextLine();
            String sobrenome = scanner.nextLine();
            Cliente novoCliente = new Cliente(nome, sobrenome);
            clientes.add(novoCliente);
            }
            case 2 ->  {
                Double saldoInicial = scanner.nextDouble();
                Conta novaConta = new Conta(saldoInicial);
            }
            case 3 -> {
                String nome = scanner.nextLine();

            }


        }
    }
}
