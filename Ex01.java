import java.util.Scanner;

public class Ex01 {

    public static void executar () {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;

        System.out.printf("\nA média dos números é: %.2f\n", media);

        System.out.println("\nValores menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("\nValores iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("\nValores superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
