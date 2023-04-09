public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial() {
        super();
    }

    @Override
    public double getTaxaOperacao() {
        return 0.001;
    }
}