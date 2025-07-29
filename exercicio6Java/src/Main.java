import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int diagonalMaior, diagonalMenor, losango;

        System.out.println("Digite o valor da diagonal Maior");
        diagonalMaior = teclado.nextInt();

        System.out.println("Digite o valor da diagonal Menor");
        diagonalMenor = teclado.nextInt();

        losango = (diagonalMaior*diagonalMenor)/2;

        System.out.println("A area do losango é: " + losango);
        

    }
}