import java.util.Scanner;

public class Ex05 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[5];

        
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();

     
        int quantidadeN = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                quantidadeN++;
            }
        }

        
        System.out.println("O número " + n + " aparece " + quantidadeN + " vezes no vetor.");

        scanner.close(); 
    }
}

