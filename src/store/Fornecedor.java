package store;

public class Fornecedor extends Entidade{

    private String cnpj;

    //Construtor
    public Fornecedor(String nome, String telefone, String endereco, String cnpj){
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\n Telefone: %s\n Endereco: %s\n CNPJ: %s\n", 
                this.getNome(), this.getTelefone(), this.getEndereco(), this.getCnpj()
        );
    }

    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
