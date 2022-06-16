package one.digitalinnovaion.bootcamp;

public class Mensagem {
    public static void cumprimentar(double hora) {
        if(hora >= 18 || hora == 0) {
            System.out.println("Boa noite!");
        }

        else if(hora >= 12) {
            System.out.print("Boa tarde!");
        }

        else if(hora >= 5) {
            System.out.println("Bom dia!");
        }
    }
}
