import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome");
        nome = teclado.next();

        System.out.println("Informe sua idade");
        idade = teclado.nextInt();

        System.out.println("Olá "+ nome + " Sua idade é: " +  idade);







    }
}