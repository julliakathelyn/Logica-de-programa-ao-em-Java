import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int base;
        int altura;
        int retangulo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base");
        base = teclado.nextInt();

        System.out.println("Digite a altura");
        altura = teclado.nextInt();

        retangulo = base * altura;

        System.out.println("A area do retangulo é :" + retangulo);


    }
}