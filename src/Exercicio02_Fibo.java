import java.util.Scanner;

public class Exercicio02_Fibo {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int n = 1000;
        int vet[] = new int[n];
        int numFibo;

        System.out.print("Informe um número: ");
        numFibo = tc.nextInt();

        vet[0] = 0;
        vet[1] = 1;
        int cont = 2;
        for (int i = 2; i < n; i++) {
            cont++;
            vet[i] = vet[i - 1] + vet[i - 2];

        }

        for (int i = 0; i < n; i++) {

            System.out.print(vet[i] + " - ");

        }

        System.out.println("\n Número de iterações: " + cont);
        boolean achou = false;
        for (int j = 0; j < n; j++) {

            if (numFibo == vet[j]) {
                achou = true;
            }

        }
        if (achou == true) {
            System.out.println("\nO número " + numFibo + " pertence a lista fibonacci ");
        } else {
            System.out.println("\nO número " + numFibo + " não pertence a lista fibonacci: ");
        }
    }
}
