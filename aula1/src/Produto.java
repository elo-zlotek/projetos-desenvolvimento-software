public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + "Preço: " + preco + "Quantidade: " + quantidade);
    }
}
