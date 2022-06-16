package one.digitalinnovation.bootcamp;

public class Quadrilatero {

    public static void area(double lado1) {
        double area = lado1 * lado1;
        System.out.println("A área do quadrado é " + area);
    }

    public static void area(double lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.println("A área do retângulo é " + area);
        // indicar o tipo de dado na hora de chamar a função
        // ex.: area(12d, 12d)
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é " + area);
    }

    public static void area(float diagonal1, float diagonal2) {
        double area = (diagonal1 * diagonal2)/2;
        System.out.println("A área do diagonal " + area);
        // indicar o tipo de dado na hora de chamar a função
        // ex.: area(12f, 12f)
    }

}
