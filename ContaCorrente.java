public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    public void Extrato(){
        System.out.println("Extrato atual da conta corrente");
        super.InfoBanco();

    }
}
