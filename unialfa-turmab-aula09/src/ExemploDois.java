import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExemploDois {

    public static void main(String[] args) {
        System.out.println("---   Bem vindo ao Little Tiger Evolution!!   ---");
        System.out.println("----------------------------------------------------");
        System.out.println("Vamos realizar o seu cadastro ->");
        List<String> listaCadastro = new ArrayList<>();
        List<String> listaDoMenu = Arrays.asList("Alterar", "Remover", "Sair");
        Scanner objetoLeitura =  new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        listaCadastro.add(objetoLeitura.nextLine());

        System.out.println("Informe seu endereço: ");
        listaCadastro.add(objetoLeitura.nextLine());

        System.out.println("Por último informe e-mail: ");
        listaCadastro.add(objetoLeitura.nextLine());



    }
}
