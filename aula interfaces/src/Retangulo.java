public class Retangulo implements Forma, imprimivel {

    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public void imprimir() {
        System.out.println("Sou a base do retângulo: " + this.base);
        System.out.println("Sou a altura do retângulo: " + this.altura);
    }
}
