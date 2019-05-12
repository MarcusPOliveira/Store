package store;

public class Compra extends Fatura {
    
    private int idCompra;
    private String tipoProduto;
    private int quantidade;

    //Construtor
    public Compra(int idCompra, String tipoProduto, int quantidade, float valor, String data) {
        super(valor, data);
        this.idCompra = idCompra;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return String.format(
                "ID Compra: %s\nTipo Produto: %s\nQuantidade: %s\nValor: %s\nData: %s\n", this.getIdCompra(),
                this.getTipoProduto(), this.getQuantidade(), this.getValor(), this.getData()
        );        
    }
   
    //Getters and setters
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }  
}
