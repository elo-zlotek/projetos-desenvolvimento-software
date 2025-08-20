//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor lucas = new Autor();
        lucas.setNome("Lucas Cristo");
        lucas.setNacionalidade("Brasileiro");
        lucas.exibirDados();

        Livro eloisa = new Livro();
        eloisa.setAno(2025);
        eloisa.setAutor(lucas);
        eloisa.setTitulo("Livro da Eloisa");

        Livro nino = new Livro();
        nino.setAno(2016);
        nino.setAutor(lucas);
        nino.setTitulo("Livro do nino");

        Livro[] listaLivros = new Livro[2];
        listaLivros[0] = eloisa;
        listaLivros[1] = nino;

        Acervo meuAcervo = new Acervo();
        meuAcervo.setLivros(listaLivros);

        meuAcervo.exibirLivros();

        Produto garfo = new Produto();
        garfo.setNome("Garfo");
        garfo.setPreco(8.50);
        garfo.setQuantidade(15);

        Produto chapeu = new Produto();
        chapeu.setNome("Chapéu");
        chapeu.setPreco(12.30);
        chapeu.setQuantidade(5);

        Produto[] listaProduto = new Produto[2];
        listaProduto[0] = garfo;
        listaProduto[1] = chapeu;


    }
}