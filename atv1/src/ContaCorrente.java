public class ContaCorrente {
    private double depositar;
    private double sacar;
    private double obter;
    private String especial;

    public ContaCorrente(double depositar, double sacar, double obter, String especial){
        this.depositar = depositar;
        this.sacar = sacar;
        this.obter = obter;
        this.especial = especial;
    }

    public String getEspecial(){
        return especial;
    }

    public double getDepositar(){
        return depositar;
    }

    public double getSacar(){
        return sacar;
    }

    public double getObter(){
        return obter;
    }
}