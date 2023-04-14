package service;

import entity.Pessoa;
import entity.Produto;

import java.time.LocalDate;
import java.util.Map;

public class VendaService {
    public void realizarVenda(Map<Produto, Integer> produtosVendidos, Pessoa cliente)
            throws Exception {
        for (Produto p : produtosVendidos.keySet()) {

            if (p.getQuantidadeEstoque() < produtosVendidos.get(p)) {
                throw new Exception("Não há quantidade suficiente em estoque para o produto ");
            }
            p.setQuantidadeEstoque(p.getQuantidadeEstoque() - produtosVendidos.get(p));
        }
        recibo(produtosVendidos, cliente);
    }
    public void recibo(Map<Produto, Integer> produtosVendidos, Pessoa cliente){

            System.out.println("Data/Hora: " + LocalDate.now());
            System.out.println("Dados do cliente:");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF/CNPJ: " + cliente.getDocumento());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println();
            System.out.println("Produtos vendidos:");
            double totalVenda = 0;

            for (Produto p : produtosVendidos.keySet()) {

                totalVenda += produtosVendidos.get(p) * p.getPrecoUnitario();
                System.out.println(p.getNome() + " - " + produtosVendidos.get(p) + " x R$ " + p.getPrecoUnitario());
            }

            System.out.println("Valor total da venda: R$ " + totalVenda);
    }
}




