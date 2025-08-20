public class contaBancaria {
    private int numero;
    private String nome;
    protected double  saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("valor não autorizado");
        }
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("valor não autorizado");
        }
    }
}
