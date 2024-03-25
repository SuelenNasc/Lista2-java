import java.util.Scanner;

public class Ex10 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
    
        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }

        System.out.println("\nVetor B (elementos de A copiados de forma invertida):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }
}

