import java.util.Scanner;

public class Ex09 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
 
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }

        System.out.println("\nVetor C gerado:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
