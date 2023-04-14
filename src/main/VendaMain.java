package main;

import entity.Pessoa;
import entity.PessoaFisica;
import entity.PessoaJuridica;
import entity.Produto;
import service.VendaService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendaMain {

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Pessoa p = null;

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe seu documento: ");
        String documento = entrada.nextLine();

        System.out.println("Informe seu endereço: ");
        String endereco = entrada.nextLine();

        System.out.println();

        if(documento.length() == 11){
            p = new PessoaFisica();
            p.setNome(nome);
            p.setDocumento(documento);
            p.setEndereco(endereco);
        }
        else if (documento.length() == 14){
            p = new PessoaJuridica();
            p.setNome(nome);
            p.setDocumento(documento);
            p.setEndereco(endereco);
        }

        Produto produto1 = new Produto("arroz", 10.99, 10);
        Produto produto2 = new Produto("feijão", 8.90, 20);
        Produto produto3 = new Produto("batata", 7.35, 15);
        Produto produto4 = new Produto("tomate", 4.50, 50);
        Produto produto5 = new Produto("carne", 39.80, 100);
        Produto produto6 = new Produto("macarrão", 3.40, 50);

        Map<Produto, Integer> carrinho = new HashMap<>();
        carrinho.put(produto1, 10);
        carrinho.put(produto4, 20);
        carrinho.put(produto5, 8);

        VendaService venda = new VendaService();
        venda.realizarVenda(carrinho, p);
    }
}
