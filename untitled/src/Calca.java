class Calca extends Roupa {
    public Calca(String tamanho, String cor, float preco) {
        super(tamanho, cor, preco);
    }

    @Override
    public float calcularPrecoFinal(float acrescimo) {
        // Desconto de 15% para calca
        return getPreco() * (1 - 0.15f) + acrescimo;
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
