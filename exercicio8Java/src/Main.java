import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int base, altura, paralelograma;

        System.out.println("Informe a base");
        base = teclado.nextInt();

        System.out.println("Informe a altura");
        altura = teclado.nextInt();

        paralelograma = base * altura;

        System.out.println("A area do paralelogram é " + paralelograma );


    }
}