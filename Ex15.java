import java.util.Scanner;

public class Ex15 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();
        
        for (int i = 1; i < vetor.length; i++) {
            int numero;
            do {
                System.out.print("Digite o próximo número maior que " + vetor[i - 1] + ": ");
                numero = scanner.nextInt();
            } while (numero <= vetor[i - 1]);
            vetor[i] = numero;
        }
    
        System.out.println("\nVetor preenchido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}

