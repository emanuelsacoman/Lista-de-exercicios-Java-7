public class App {
    public static void main(String[] args) throws Exception {
        ClienteEspecial conta1 = new ClienteEspecial(50, 50, 50, "false");
        ClienteEspecial conta2 = new ClienteEspecial(50, 50, 50, "true");

        System.out.println(conta1.isEspecial());
        System.out.println(conta2.isEspecial());
    }
}
