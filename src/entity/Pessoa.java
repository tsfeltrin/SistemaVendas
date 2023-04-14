package entity;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) throws Exception {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


