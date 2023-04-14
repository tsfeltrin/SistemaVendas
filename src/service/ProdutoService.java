package service;

import entity.Produto;

public class ProdutoService {
    public void add(Produto produto) throws Exception {
        if(produto.getNome() == null || produto.getNome().isEmpty()){
            throw new Exception("Nome do produto é inválido.");
        }
        if(produto.getPrecoUnitario() <= 0){
            throw new Exception("Valor do produto é inválido.");
        }
        System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso.");
    }
}
