import java.util.Scanner;

public interface ContaI {
    void Sacar(double valor);

    void Depositar(double valor);

    void Transferir(double valor, Conta ContaDestino);

    void Extrato();
}
