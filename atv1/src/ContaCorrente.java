public class ContaCorrente {
    private double saldo;
    private double taxaOperacao;

    public ContaCorrente() {
        this.saldo = 0;
        this.taxaOperacao = 0.005;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double taxa = valor * getTaxaOperacao();
        this.saldo -= (valor + taxa);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxaOperacao() {
        return this.taxaOperacao;
    }
}