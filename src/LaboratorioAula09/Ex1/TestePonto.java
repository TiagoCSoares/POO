package LaboratorioAula09.Ex1;

import LaboratorioAula09.Ex1.Ponto;

public class TestePonto {

    public static void main(String[] args){

        Ponto primeiroPonto = new Ponto();

        Ponto segundoPonto = new Ponto(400, 230);

        primeiroPonto.setX(200);
        primeiroPonto.setY(200);

        System.out.println("Coordenandas do primeiro ponto (x,y):" +
                "(" + primeiroPonto.getX()+"," + primeiroPonto.getY() +
                ")");

        System.out.println("Coordenandas do segundo ponto (x,y):" +
                segundoPonto);

        Ponto outraRefSegundoPonto = segundoPonto;

        System.out.println();
        System.out.println("\nCoordenandas do primeiro ponto (x,y):" +
                "(" + primeiroPonto.getX()+"," + primeiroPonto.getY() +
                ")");
        System.out.println("Coordenandas do segundo ponto (x,y):" +
                segundoPonto);
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto" +
                " (x,y):" + outraRefSegundoPonto);

        segundoPonto.setX(840);
        segundoPonto.setY(350);

        System.out.println();

        System.out.println("Alterando as coordenadas do segundo ponto para " + segundoPonto);
        System.out.println();

        System.out.println("Coordenandas do primeiro ponto (x,y):" +
                "(" + primeiroPonto.getX()+"," + primeiroPonto.getY() +
                ")");
        System.out.println("Coordenandas do segundo ponto (x,y):" +
                segundoPonto);
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto" +
                " (x,y):" + outraRefSegundoPonto);

    }
}
