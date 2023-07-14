package quartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {
    public static void quartoDesafio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe a proxima linha: ");
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarString(linha);
            System.out.println(linhaDecifrada);
        }
    }

    public static String decifrarString(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = meio - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= meio; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}