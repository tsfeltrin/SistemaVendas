package entity;

public class PessoaJuridica extends Pessoa{

    @Override
    public void setDocumento(String documento) throws Exception {
        if(documento.length() != 14) {
            throw new Exception("Documento inválido");
        }

        super.setDocumento(documento);
    }
}
