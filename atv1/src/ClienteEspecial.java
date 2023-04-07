public class ClienteEspecial extends ContaCorrente{    

    public ClienteEspecial(double depositar, double sacar, double obter, String especial){
        super(depositar, sacar, obter, especial);
        }

    public double isEspecial(){
        if(getEspecial() == "true"){
            return getSacar() * 1.01;
        }else if(getEspecial() == "false"){
            return getSacar() * 1.05;
        }else{
            return 0;
        }
    }
}