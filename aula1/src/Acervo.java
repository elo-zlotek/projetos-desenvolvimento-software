public class Acervo {
    private Livro[] livros;

    public Acervo() {
        this.livros = new Livro[2];
    }
    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void exibirLivros() {
        for(int i = 0; i < this.livros.length; i++) {
            livros[i].exibirDados();
            System.out.println();
        }
    }
}

