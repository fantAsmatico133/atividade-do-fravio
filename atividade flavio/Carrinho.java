public class Carrinho {
   private NoProduto cabeca;
   private NoProduto cauda;

   public void adicionarInicio() {
      NoProduto novoP = new NoProduto(null, 0);
      if (cabeca != null) {// já tem pelo menos 1 nó
         novoP.setProximo(cabeca);
         cabeca.setAnterior(novoP);
      } else {// lista estava vazia
         cauda = novoP;
      }
      cabeca = novoP;
   }

   public void adicionarProduto(String nome, int quantidade) {
      NoProduto atual = cabeca;
      boolean encontrado = false;

      // Procura o produto na lista
      while (atual != null) {
         if (atual.getNome().equals(nome)) {
            encontrado = true;
            int quantidadeAtual = atual.getQuantidade();
            atual.setQuantidade(quantidadeAtual + quantidade);
            break;
         }
         atual = atual.getProximo();
      }

      // Se não achou, cria um novo nó
      if (!encontrado) {
         NoProduto novo = new NoProduto(nome, quantidade);
         if (cabeca == null) {
            // Lista vazia → primeiro nó
            cabeca = novo;
            cauda = novo;
         } else {
            // Já tem elementos → adiciona no fim
            cauda.setProximo(novo);
            novo.setAnterior(cauda);
            cauda = novo;
         }
      }
   }

   public void exibirDados() {
      NoProduto atual = cabeca;
      while (atual != null) {
         System.out.println(atual.getNome() + " - quantidade" + atual.getQuantidade());
         atual = atual.getProximo();
      }
   }
}