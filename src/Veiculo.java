public class Veiculo {

    private double cargaMaxima;
    private double carga;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }


    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }


    public boolean adicionarCarga(double carga) {
        if (this.carga + carga > this.cargaMaxima)
            return false;
        this.carga += carga;
        return true;
    }


    private double newtonsParaQuilos(double peso) {
        return peso*9.8;
    }

    private double quilosParaNewtons(double peso) {
        return peso/9.8;
    }
}
