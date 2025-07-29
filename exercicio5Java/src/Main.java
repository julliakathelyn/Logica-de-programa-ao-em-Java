import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int lado, quadrado;

        System.out.println("Informe o valor do lado do quadrado");
        lado = teclado.nextInt();

        quadrado = lado * lado;

        System.out.println("A area do quadrado é: " + quadrado);


    }
}