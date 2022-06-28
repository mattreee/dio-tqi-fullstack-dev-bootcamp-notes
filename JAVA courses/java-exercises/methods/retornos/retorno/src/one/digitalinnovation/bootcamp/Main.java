package one.digitalinnovation.bootcamp;

public class Main {

    public static void main(String[] args) {

        double areaQuadrado = Quadrilatero.area(3);
        double areaRetangulo = Quadrilatero.area(3, 4);
        double areaTrapezio = Quadrilatero.area(5, 3, 4);

        System.out.println("A Area do Quadrado é: " + areaQuadrado);
        System.out.println("A Area do Retângulo é: " + areaRetangulo);
        System.out.println("A Area do Trapézio é: " + areaTrapezio);
    }

}
