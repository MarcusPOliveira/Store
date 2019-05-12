package store;

public class Loja extends Entidade{

    private String cnpj;

    //Construtor
    public Loja(String nome, String telefone, String endereco, String cnpj){
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
    
    public static void main(String[] args) {
       
    }

    /*
    public float calculaFaturamento(){
        float faturamento;

        return faturamento;
    }
    */

    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
