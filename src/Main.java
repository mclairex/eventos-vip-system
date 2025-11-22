import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Menu: Restaurante Divas");
        System.out.println("1: Cadastrar Convidado:");

        valor = sc.nextInt();

        if (valor ==  1) {
            System.out.println("Insira o ID do convidado: ");
            int id = sc.nextInt();

            System.out.println("Insina o nome do convidado: ");
            String nome = sc.nextLine();

            System.out.println("Insira o tipo: regular ou vip");
            String tipo = sc.nextLine();

            Convidado convidado = new Convidado(id, nome, tipo);

            //TODO: Adicionar convidado à mesa.

        }

    }


}
