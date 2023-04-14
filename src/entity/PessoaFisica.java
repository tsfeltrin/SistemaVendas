package entity;

public class PessoaFisica extends Pessoa{

    @Override
    public void setDocumento(String documento) throws Exception {
        if(documento.length() != 11) {
            throw new Exception("Documento inválido");
        }

        super.setDocumento(documento);
    }
}
