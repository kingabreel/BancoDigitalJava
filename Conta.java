public abstract class Conta implements ContaI {
    protected static final int AGENCIA_PADRAO = 0001;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 4102;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void Sacar(double valor) {
        saldo -= valor;
    }

    public void Depositar(double valor) {
        saldo += valor;
    }

    public void Transferir(double valor, Conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void CriarConta(){
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);
    }
    public void InfoBanco(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}