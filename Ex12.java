import java.util.Scanner;

public class Ex12 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);


        int[] vetor = new int[12];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;

        for (int i = 0; i < vetor.length; i++) {
    
            if (vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }

        System.out.println("Produto dos elementos pares positivos: " + produto);

        scanner.close();
    }
}
