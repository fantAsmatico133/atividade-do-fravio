public class NoProduto{
    private String nome;
    private int quantidade;
    private NoProduto proximo;
    private NoProduto anterior;

    public NoProduto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.proximo = null;
        this.anterior = null;
    }
    //////////////////////////////////////////////
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //////////////////////////////////////////////
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    //////////////////////////////////////////////
    public NoProduto getProximo(){
        return proximo;
    }
    public void setProximo(NoProduto proximo){
        this.proximo = proximo;
    }
    //////////////////////////////////////////////
    public NoProduto getAnterior(){
        return anterior;
    }
    public void setAnterior(NoProduto anterior){
        this.anterior = anterior;
    }
}