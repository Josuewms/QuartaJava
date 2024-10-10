import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LittleTigerEvo {
    public static final int INDEX_NOME = 0;
    public static final int INDEX_ENDERECO = 1;
    public static final int INDEX_EMAIL = 2;

    private static List<String[]> listaDoadores = new ArrayList<>();

    public static void main(String[] args) {

        adicionarDoador();
        adicionarDoador();
        adicionarDoador();
        listarB();

        System.out.println(listaDoadores);

    }

    private static void listarB (listaDoadores) {
            System.out.println(doador);
        }
    }

    private static void adicionarDoador(){
        String[] doador = new String[3];
        Scanner objetoScanner = new Scanner(System.in);

        System.out.println("Nome: ");
        doador[INDEX_NOME] = objetoScanner.nextLine();

        System.out.println("Endereço: ");
        doador[INDEX_ENDERECO] = objetoScanner.nextLine();

        System.out.println("E-mail: ");
        doador[INDEX_EMAIL] = objetoScanner.nextLine();

        listaDoadores.add(doador);
    }
}
