package exerecicioParte1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os nomes e use virgulas para separá-los: ");
        String entrada = sc.nextLine();

        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes ordenados em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}