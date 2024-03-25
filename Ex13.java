import java.util.Scanner;

public class Ex13 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

  
        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        scanner.close();
    }
}
