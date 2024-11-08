package exercicioParte2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> grupoMasc = new ArrayList<>();
        List<String> grupoFem = new ArrayList<>();

        System.out.print("Digite seu nome e seu sexo (Formato: NOME - SEXO): ");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split(" - ");
            if (partes.length != 2) {
                System.out.println("FORMATO INVALIDO!");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim();

            if (sexo.equalsIgnoreCase("F")) {
                grupoFem.add(nome);
            } else if  (sexo.equalsIgnoreCase("M")) {
                grupoMasc.add(nome);
            } else {
                System.out.println("SEXO INVÁLIDO! DIGITE 'M' OU 'F'.");
            }

        }
            System.out.println("\n Grupo MASCULINO: ");
            for (String nome : grupoMasc) {
                System.out.println(nome);
            }

            System.out.println("\n Grupo FEMININO: ");
            for (String nome : grupoFem) {
                System.out.println(nome);
            }
    }
}
