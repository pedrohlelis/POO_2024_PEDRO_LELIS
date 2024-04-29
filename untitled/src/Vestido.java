public class Vestido extends Roupa {
    public Vestido(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        // Desconto de 20% para vestido
        return getPreco() * (1 - 0.2f) + acrescimo;
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
