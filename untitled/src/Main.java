public class Main {
    public static void main(String[] args) {

        // Instanciando classes
        Camisa camisa = new Camisa("M", "Azul", 50.0f);
        Calca calca = new Calca("38", "Preto", 80.0f);
        Vestido vestido = new Vestido("P", "Vermelho", 120.0f);

        // Definindo preço para cada produto
        camisa.setPreco(50.0f);
        calca.setPreco(80.0f);
        vestido.setPreco(120.0f);

        // exibindo resultado de calcularPrecoFinal()
        float acrescimo = 5.0f; // Exemplo de valor de acréscimo
        System.out.println("Preço final da camisa: " + camisa.calcularPrecoFinal(acrescimo));
        System.out.println("Preço final da calça: " + calca.calcularPrecoFinal(acrescimo));
        System.out.println("Preço final do vestido: " + vestido.calcularPrecoFinal(acrescimo));
    }
}