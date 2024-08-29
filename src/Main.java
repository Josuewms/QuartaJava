import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objetoDeLeitura = new Scanner(System.in);
        imprimir("UniALFA - Aula 4");
        imprimir("Informe seu nome:");
        String nome = objetoDeLeitura.nextLine();
        imprimir(nome);
        objetoDeLeitura.close();
    }
    private static void imprimir(String valor){
        System.out.println(valor);
    }
}