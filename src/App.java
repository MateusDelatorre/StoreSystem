import Classes.Auditor;
import Classes.Caixa;
import Classes.Cliente;
import Classes.Funcionario;
import Classes.Gerente;
import Classes.Pessoa;
import Classes.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        //TESTE DAS CLASSES
        Pessoa p1 = new Pessoa("Nome Pessoa", "CPF Pessoa");
        Cliente c1 = new Cliente("Nome Cliente", "CPF Cliente", "Senioridade cliente", 1000);
        Funcionario f1 = new Funcionario("Nome Funcionario", "CPF Funcionario", 1100);
        Caixa ca1 = new Caixa("Nome Caixa", "CPF Caixa", 1200);
        Vendedor v1 = new Vendedor("Nome Vendedor", "CPF Vendedor", 1300, 100);
        Auditor a1 = new Auditor("Nome Auditor", "CPF Auditor", 1400);
        Gerente g1 = new Gerente("Nome Gerente", "CPF Gerente", 1500, 10000);

        System.out.println(p1.getNome()+" "+p1.getCpf());
        System.out.println(c1.getNome()+" "+c1.getCpf()+" "+c1.getSenioridade()+" "+" "+c1.getTotalComprado());
        System.out.println(f1.getNome()+" "+f1.getCpf()+" "+f1.getSalario());
        System.out.println(ca1.getNome()+" "+ca1.getCpf()+" "+ca1.getSalario());
        System.out.println(v1.getNome()+" "+v1.getCpf()+" "+v1.getSalario()+" "+v1.getVendasMes());
        System.out.println(a1.getNome()+" "+a1.getCpf()+" "+a1.getSalario());
        System.out.println(g1.getNome()+" "+g1.getCpf()+" "+g1.getSalario()+" "+g1.getLucroObtidoMes());

}
}
