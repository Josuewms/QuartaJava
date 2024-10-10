import java.util.Scanner;

public class Exemplo {

    private static String[] carros = new String[5];

    public static void main(String[] args) {
        System.out.println("Garagem UniALFA");
        cadastrarCarro();
        imprimirExtrato();
    }

    private static void cadastrarCarro() {
        Scanner objetoLeitura = new Scanner(System.in);
        int index = 0;
        boolean continuar = false;
        do {
            System.out.println("Informe o nome do carro");
            carros[index++] = objetoLeitura.nextLine();

            if (index < carros.length) {
                System.out.println("Deseja cadastrar outro carro? [1] Sim");
                continuar = objetoLeitura.nextLine().equals("1");
            } else {
                System.out.println("Limite de carros atingido.");
                continuar = false;
            }
        } while (continuar);
        System.out.println("Cadastro encerrado.");
    }

    private static void imprimirExtrato() {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null) System.out.println("Carro " + carros[i] + " cadastrado!");
        }
    }
}
