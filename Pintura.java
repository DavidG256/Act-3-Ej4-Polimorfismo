public class Pintura {
    protected double cobertura;


    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularCantidad(Forma forma) {
        return forma.area() / cobertura;
    }
}

