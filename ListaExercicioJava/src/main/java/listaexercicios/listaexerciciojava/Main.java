/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexercicios.listaexerciciojava;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cerveja> cervejas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro da " + (i + 1) + "ª cerveja:");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            Cerveja cerveja = new Cerveja(marca);

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();
            cerveja.setTipo(tipo);

            System.out.print("Teor alcoólico: ");
            double teorAlcoolico = scanner.nextDouble();
            cerveja.setTeorAlcoolico(teorAlcoolico);

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            cerveja.setPreco(preco);

            cervejas.add(cerveja);
            scanner.nextLine();
        }

        System.out.println("\nCervejas cadastradas:");
        for (Cerveja cerveja : cervejas) {
            System.out.println("Código: " + cerveja.getCodigo());
            System.out.println("Marca: " + cerveja.marca);
            System.out.println("Tipo: " + cerveja.tipo);
            System.out.println("Teor alcoólico: " + cerveja.teorAlcoolico);
            System.out.println("Preço: " + cerveja.preco);
            System.out.println();
        }
    }
}