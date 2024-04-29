public class Camisa extends Roupa {
    public Camisa(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        // Desconto de 10% para camisa
        return getPreco() * (1 - 0.1f) + acrescimo;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }
}
