import java.util.Scanner;

public class Exercicio05_InvertePalavra {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String palavra;

        System.out.print("Informe uma string: ");
        palavra = tc.nextLine();

        String inverte = "";
        int tam = palavra.length();

        for (int i = (tam-1); i >= 0; i--) {

            inverte = inverte + palavra.charAt(i);

        }
        System.out.println(inverte);

    }
}
