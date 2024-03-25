import java.util.Scanner;

public class Ex07 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

    
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        
        boolean iguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }

    
        if (iguais) {
            System.out.println("\nOs vetores são iguais.");
        } else {
            System.out.println("\nOs vetores não são iguais.");
        }

        scanner.close();
    }
}

