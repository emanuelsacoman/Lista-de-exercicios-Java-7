public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        cc.sacar(100);
        System.out.println(cc.getSaldo());

        ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
        cce.depositar(1000);
        cce.sacar(100);
        System.out.println(cce.getSaldo());
    }
}