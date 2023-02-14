import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco JAVABANCO");
        System.out.println("Por favor informe sua escolha: \n1- Login\n2- Registrar");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan == 1){

        } else if (scan == 2) {

        } else {
            System.out.println("Escolha invalida!\nConfira se está correto");
        }

        if (scan == 1){
            login();
        } else{
            registrarInfos();
        }


    }

    static void login(){
        System.out.println("Insira seu usuário!");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Digite sua senha");
        int pass = scanner.nextInt();

        System.out.println("loggando...");

        Cliente cliente = new Cliente();
        cliente.setNome(login);
        ContaCorrente corrente = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        corrente.Extrato();
        System.out.println("\n\n\n");
        poupanca.Extrato();
    }
    static void registrarInfos(){
        System.out.println("Insira suas informações\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String userName = scanner.nextLine();
        System.out.print("\nEmail: ");
        String userMail = scanner.nextLine();
        System.out.println("\nSenha de 6 digitos numericos: ");
        int pass = scanner.nextInt();

        System.out.println("Registro efetuado com sucesso!");


        Cliente cliente = new Cliente();
        cliente.setNome(userName);
    }

}