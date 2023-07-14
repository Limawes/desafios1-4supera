package terceiroDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void terceiroDesafio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do array: ");
        int n = scanner.nextInt();
        System.out.println("Informe o valor alvo: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Informe o tamanho do Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = contarPares(arr, k);
        System.out.println(count);
    }

    public static int contarPares(int[] arr, int k) {
        Map<Integer, Integer> mapaFrequencia = new HashMap<>();
        int count = 0;

        for (int num : arr) {

            if (mapaFrequencia.containsKey(num - k)) {
                count += mapaFrequencia.get(num - k);
            }

            if (mapaFrequencia.containsKey(num + k)) {
                count += mapaFrequencia.get(num + k);
            }

            mapaFrequencia.put(num, mapaFrequencia.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}