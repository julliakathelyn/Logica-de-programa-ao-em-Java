import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int baseMaior, baseMenor;
        double h, trapezio;

        System.out.println("Informe a base maior");
        baseMaior = teclado.nextInt();

        System.out.println("Informe a base Menor");
        baseMenor = teclado.nextInt();

        System.out.println("Informe a altura");
        h = teclado.nextDouble();

        trapezio = (baseMaior*baseMenor)*h/2;

        System.out.println("A area do trapézio é" + trapezio);


    }
}