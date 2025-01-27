public class MainPintura {
    public static void main(String[] args) {

        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);


        System.out.println(rectangulo.toString());
        System.out.println("Cantidad pintura necesaria para el rectángulo: " +
                pintura.calcularCantidad(rectangulo) + " unidades\n");

        System.out.println(esfera.toString());
        System.out.println("Cantidad pintura necesaria para la esfera: " +
                pintura.calcularCantidad(esfera) + " unidades\n");

        System.out.println(cilindro.toString());
        System.out.println("Cantidad pintura necesaria para el cilindro: " +
                pintura.calcularCantidad(cilindro) + " unidades\n");
    }
}

