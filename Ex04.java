import java.util.Scanner; 

public class Ex04 {

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

        
        System.out.println("\nÍndices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice: " + i);
            }
        }

        scanner.close();
    }
}

