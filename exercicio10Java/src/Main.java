import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double pi = 3.14, circulo;
        int raio, raioAoQuadrado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = teclado.nextInt();

        raioAoQuadrado = raio*raio;

        circulo = pi*raioAoQuadrado;

        System.out.println("A area do circulo é: " + circulo);



    }
}