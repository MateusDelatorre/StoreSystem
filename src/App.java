import Classes.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
           Cliente c1 = new Cliente("123456","João","Pleno",1250);

           System.out.println(c1.getNome());
}
}
