package store;

public class Cliente extends Entidade{

    private String cpf;

    //Construtor
    public Cliente (String nome, String telefone, String endereco, String cpf){
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\n Telefone: %s\n Endereco: %s\n CPF: %s\n", 
                this.getNome(), this.getTelefone(), this.getEndereco(), this.getCpf()
        );
    }

    //Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
