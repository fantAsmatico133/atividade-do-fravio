public class Principal {
    public static void main(String[] args) {
        Carrinho lista = new Carrinho();
        lista.adicionarProduto("macarrão ", 1);
        lista.adicionarProduto("carne ", 2);
        lista.adicionarProduto("arroz ", 3);
        lista.adicionarProduto("feijão ", 4);
        lista.adicionarProduto("macarrão ", 2);
        lista.exibirDados();
    }
}
