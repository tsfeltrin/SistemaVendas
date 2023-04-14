package main;

import entity.Pessoa;
import entity.Produto;
import service.ProdutoService;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o valor: ");
        double valor = entrada.nextDouble();

        ProdutoService produtoService = new ProdutoService();

        Produto produto = new Produto(nome, valor, quantidade);
        produtoService.add(produto);

    }
}
