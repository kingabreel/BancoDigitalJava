import java.util.List;

public class Banco {
    private String bancoNome;
    private List<Conta> contas;

    public String getBancoNome() {
        return bancoNome;
    }

    public void setBancoNome(String bancoNome) {
        this.bancoNome = bancoNome;
    }
    public List<Conta> getContas(){
        return contas;
    }
    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

}
