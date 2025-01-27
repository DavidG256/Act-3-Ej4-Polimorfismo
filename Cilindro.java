public class Cilindro extends Forma {
    protected double radio;
    protected double altura;


    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }


    @Override
    public double area() {
        return (2 * Math.PI * Math.pow(radio, 2)) + (2 * Math.PI * radio * altura);
    }


    @Override
    public String toString() {
        return super.toString() + "Radio:" + radio + "Altura:" + altura;
    }
}

