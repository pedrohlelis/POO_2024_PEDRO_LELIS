abstract class Roupa implements Produto {
    private String tamanho;
    private String cor;
    private float preco;

    public Roupa(String tamanho, String cor, float preco) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Método abstrato para calcular o preço final com desconto
    public abstract float calcularPrecoFinal(float acrescimo);
}
