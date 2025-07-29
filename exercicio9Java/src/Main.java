import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner teclado  = new Scanner(System.in);

        int base, altura, triangulo;

        System.out.println("Digite o valor da base");
        base = teclado.nextInt();

        System.out.println("Digite o valor da altura");
        altura = teclado.nextInt();

        triangulo = (base*altura)/2;

        System.out.println("A area do triangulo é: "+ triangulo);

        

    }
}