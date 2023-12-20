package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = lerPessoasDoConsole();
        
        List<Pessoa> mulheres = filtrarMulheres(listaPessoas);

        System.out.println("Lista de mulheres:");
        mulheres.forEach(pessoa -> System.out.println("Nome: " + pessoa.nome + ", Sexo: " + pessoa.sexo));
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> listaPessoas) {
        return listaPessoas.stream()
                .filter(pessoa -> "Feminino".equalsIgnoreCase(pessoa.sexo))
                .collect(Collectors.toList());
    }

    static List<Pessoa> lerPessoasDoConsole() {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();

        System.out.println("Digite o número de pessoas:");
        int numPessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (Masculino/Feminino):");
            String sexo = scanner.nextLine();

            listaPessoas.add(new Pessoa(nome, sexo));
        }

        return listaPessoas;
    }
}
