package store;

public class Venda extends Fatura {

    private int idVenda;
    private String formaPagamento;

    //Construtor
    public Venda(int idVenda, String formaPagamento, float valor, String data) {
        super(valor, data);
        this.idVenda = idVenda;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return String.format(
                "ID Venda: %s\nForma Pagamento: %s\n", this.getIdVenda(), this.getFormaPagamento()
        );
    }
    
    //Getters and Setters
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }        
}
