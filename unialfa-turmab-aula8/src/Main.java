import java.util.Scanner;

public class Main {
    private static String nome;
    private static int idade = 0;
    private static int valorDoado = 0;

    public static void main(String[] args) {
        System.out.println("----- Bem vindo ao Tigrinho! -----");
        Scanner objetoScan = new Scanner(System.in);
        int opcaoMenu = 0;
        do {
            System.out.println("""
                    1 - Aicionar Cliente
                    2 - Exibir os Dados do Cliente
                    3 - Alterar dados do Cliente
                    4 - Remover CLiente
                    5 - Realizar Doação 
                    6 - Sair
                    """);
            opcaoMenu = objetoScan.nextInt();
            if (opcaoMenu == 1) {
                adicionarCliente();
            } else if (opcaoMenu == 2) {
                exibirDados();
            } else if (opcaoMenu == 3) {
                alterarCliente();
            } else if (opcaoMenu == 4) {
                removerCliente();
            } else if (opcaoMenu == 5) {
                realizarDoacao();
            }
        }while (opcaoMenu != 6)
        }
    }

    private static void adicionarCliente(){
        Scanner objetoScan = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = objetoScan.nextLine();

        System.out.println("Informe sua idade: ");
        idade = objetoScan.nextInt();
        validarIdade();
    }

    private static void exibirDados(){
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Idade do cliente: "+idade);
        System.out.println("Valor doado pelo cliente: "+valorDoado);
    }

    private static void validarIdade(){
        if (idade < 18){
            System.out.println("Desculpe, você precisa ter 18 anos ou mais para prosseguir");
            removerCliente();
        }
    }

    private static void removerCliente(String mensagem) {
        nome = "";
        idade = 0;
        valorDoado = 0;
        System.out.println(mensagem);
    }

    private static void alterarCliente(){
        if (idade > 17){
            System.out.println("Alterando os dados do cliente: "+nome);
            adicionarCliente();
            System.out.println("----- Cliente alterado com sucesso -----");
            exibirDados();
        } else {
            System.out.println("Não tem cliente cadastrado ainda!");
        }
    }

    private static void realizarDoacao(){
        Scanner objetoScan = new Scanner(System.in);
        if (idade > 17){
            System.out.println("Informe o valor (inteiro) da doação: ");
            valorDoado = valorDoado + objetoScan.nextInt();
            System.out.println("O saldo doado do cliente " + nome + " é: " + valorDoado);
        } else {
            System.out.println("Não tem cliente cadastrado ainda!");
        }
    }
}