package Laboratorio13.Ex1;

public class TesteExcecao {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Exceção capturada..:: " + e);
            //System.out.println("Aplicação sendo fechada");
            throw new ArrayIndexOutOfBoundsException("Erro: " + e);
        }
    }

}
