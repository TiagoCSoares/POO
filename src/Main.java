

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Veiculo teste1 = new Veiculo(500.0);

        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            double carga = scanner.nextDouble();
            System.out.printf("Adicionando caixa %d %.2f kg : %b\n",i, carga, teste1.adicionarCarga(carga));
        }

        System.out.println("Carga total: " + teste1.getCarga());
    }

    public static void adicionarCarga(Veiculo veiculo, double carga) {
        veiculo.adicionarCarga(carga);
    }
}