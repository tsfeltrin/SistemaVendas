package entity;

public class Produto {

        private String nome;
        private double precoUnitario;
        private int quantidadeEstoque;

     public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto() {

    }

    public String getNome() {
            return nome;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        public void setPrecoUnitario(double precoUnitario) {
            this.precoUnitario = precoUnitario;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        public void setQuantidadeEstoque(int quantidadeEstoque) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
}
