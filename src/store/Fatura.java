package store;

public class Fatura {
    
    private float valor;
    private String data; //mudar para date

    //Construtor
    public Fatura(float valor, String data) {
        this.valor = valor;
        this.data = data;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Valor: %s\nData: %s\n", this.getValor(), this.getData()
        );
    }

    //Getters and Setters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }    
}
