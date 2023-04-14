package entity;

import java.time.LocalDate;
import java.util.ArrayList;

 public class Venda extends Produto {
        private LocalDate dataHora;
        private ArrayList<Produto> produtosVendidos;
        private Pessoa cliente;

        public Venda(LocalDate dataHora, ArrayList<Produto> produtosVendidos, Pessoa cliente) {
            super();
            this.dataHora = dataHora;
            this.produtosVendidos = produtosVendidos;
            this.cliente = cliente;
        }

        public LocalDate getDataHora() {
            return dataHora;
        }

        public ArrayList<Produto> getProdutosVendidos() {
            return produtosVendidos;
        }

        public Pessoa getPessoa() {
            return cliente;
        }

        public double getValorTotal() {
            double valorTotal = 0;
            for (Produto p : produtosVendidos) {
                valorTotal += p.getPrecoUnitario() * p.getQuantidadeEstoque();
            }
            return valorTotal;
        }
    }


