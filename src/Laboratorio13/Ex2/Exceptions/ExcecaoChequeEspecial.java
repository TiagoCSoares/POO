package Laboratorio13.Ex2.Exceptions;

public class ExcecaoChequeEspecial  extends Exception {

    private double deficit;

    public ExcecaoChequeEspecial(String messagem, double deficit) {
        super( messagem);
        this.deficit = deficit;
    }

    public double getDeficit(){
        return this.deficit;
    }


}
