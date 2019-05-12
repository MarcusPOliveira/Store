package store;

public class Produto {
    
    private int idProduto;
    private String nome;
    private float valor;
    private int quantidade;
    private String tamanho;
    private String tipoProduto;
    private String descricao;
    
    //Construtor
    public Produto(int idProduto, String nome, float valor, int quantidade, String tamanho, String tipoProduto, String descricao) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.tamanho = tamanho;
        this.tipoProduto = tipoProduto;
        this.descricao = descricao;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format (
                "ID Produto: %s\nNome: %s\nValor: %s\nQuantidade: %s\nTamanho: %s\nTipo Produto: %s\nDescrição: %s\n",
                this.getIdProduto(), this.getNome(), this.getValor(), this.getQuantidade(), this.getTamanho(),
                this.getTipoProduto(), this.getDescricao()
        );
    }
    
    //Getters and Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
}
