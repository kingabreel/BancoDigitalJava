public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    public void Extrato(){
        System.out.println("Extrato atual da conta poupança");
        InfoBanco();

    }
}
