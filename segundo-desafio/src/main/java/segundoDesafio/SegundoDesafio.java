package segundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    public static void segundoDesafio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor desejado, separando centavos por ponto'.'");
        double valor = scanner.nextDouble();

        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
            valor %= moeda;
        }
    }
}