import java.util.Scanner;

public class Ex14 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];
    
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;
    
        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
