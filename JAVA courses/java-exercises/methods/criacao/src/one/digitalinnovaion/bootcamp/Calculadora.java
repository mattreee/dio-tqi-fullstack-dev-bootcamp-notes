package one.digitalinnovaion.bootcamp;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double operation, x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation: (1: +, 2: -, 3: *, 4: /)");
        operation = scanner.nextInt();

        System.out.println("input first number: ");
        x = scanner.nextInt();

        System.out.println("input second number: ");
        y = scanner.nextInt();

        if(operation == 1) {
            System.out.println(x + y);
        }
        if(operation == 2) {
            System.out.println(x - y);
        }
        if(operation == 3) {
            System.out.println(x * y);
        }
        if(operation == 4) {
            System.out.println(x / y);
        }
    }

    public static void add(double numberX, double numberY) {
        double result = numberX + numberY;
        System.out.println("A some de " + numberX + " e " + numberY + " é " + result);
    }

    public static void subtracao(double numberX, double numberY) {
        double result = numberX - numberY;
        System.out.println("A subtração de " + numberX + " e " + numberY + " é " + result);
    }

    public static void multiplicacao(double numberX, double numberY) {
        double result = numberX * numberY;
        System.out.println("A multiplicação de " + numberX + " e " + numberY + " é " + result);
    }

    public static void divisao(double numberX, double numberY) {
        double result = numberX / numberY;
        System.out.println("A divisão de " + numberX + " e " + numberY + " é " + result);
    }
}
