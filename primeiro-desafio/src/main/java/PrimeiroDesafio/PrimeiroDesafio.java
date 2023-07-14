package PrimeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void primeiroDesafio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de entradas: ");
        int n = scanner.nextInt();
        System.out.println("Informe os numeros: ");
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);


        Collections.sort(impares, Collections.reverseOrder());

        // Imprime os pares
        for (int par : pares) {
            System.out.println(par);
        }

        // Imprime os ímpares
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}