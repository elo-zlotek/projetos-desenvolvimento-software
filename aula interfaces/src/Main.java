public class Main {
    public static void main(String[] args) {

        relatorio meuRelatorio = new relatorio();
        meuRelatorio.imprimir();

        Retangulo re = new Retangulo();
        re.setBase(12.5);
        re.setAltura(3);
        System.out.println("Área: " +
                re.calcularArea());
        System.out.println("Perímetro: " +
                re.calcularPerimetro());
        re.imprimir();

        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        soma.executar(5,7);
        sub.executar(8,6);
        mult.executar(2,2);
        div.executar(10,5);

        soma.descricao();
        sub.descricao();
        mult.descricao();
        div.descricao();

    }
}