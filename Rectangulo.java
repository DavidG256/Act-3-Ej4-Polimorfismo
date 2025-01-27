public class Rectangulo extends Forma {
    protected double largo;
    protected double ancho;


    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.largo = largo;
        this.ancho = ancho;
    }


    @Override
    public double area() {
        return largo * ancho;
    }


    @Override
    public String toString() {
        return super.toString() + "Largo: " + largo + "Ancho:" + ancho;
    }
}

