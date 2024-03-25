import java.util.Scanner;

public class Ex08 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[A.length + B.length];

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

     
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

      
        System.out.println("\nVetor C (concatenação de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}

