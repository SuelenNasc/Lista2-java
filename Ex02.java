import java.util.Scanner; 

public class Ex02 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in); 

       
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

       
        int[] vetor = new int[tamanho];

      
        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + " é ");
            if (vetor[i] > 0) {
                System.out.println("positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("negativo.");
            } else {
                System.out.println("zero.");
            }
        }

        scanner.close();
    }
}

