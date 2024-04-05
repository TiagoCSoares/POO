package LaboratorioAula10.Ex1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TesteArrays {

    public static void main(String[] args) {

        Integer[] array1 = {2,3,5,7,11,13,17,19};
        Integer[] array2 = {};
        array2 = array1;

        for(int i = 0; i < array2.length; i++) {
            if(i%2 == 0)
                array2[i] = i;
        }

        exibirArray(array1);
        System.out.println();
        exibirArray(array2);
        System.out.println();

        Integer[][] matriz = {{},
                {0},
                {0,2},
                {0,3,6},
                {0,4,8,12}};
        exibirMatriz(matriz);

        System.out.println("Imprimindo array1, array2 e matriz usando métodos" +
                " estáticos da classe Arrays");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.deepToString(matriz));

    }


    public static <T> void exibirMatriz(T[][] matriz){
        System.out.println("Imprimindo a matriz");
        for(int i = 0; i < matriz.length; i++) {
            exibirArray(matriz[i]);
        }
    }

    public static <T> void exibirArray(T[] array) {
        System.out.print("<");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i+1 < array.length)
                System.out.print(", ");
        }
        System.out.println(">");
    }
}
