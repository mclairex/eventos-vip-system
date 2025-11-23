import javax.swing.plaf.synth.SynthOptionPaneUI;

import Desconto.Convidado;
import entidade.Garcom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garcom garcom = new Garcom(1, "João");
        garcom.atribuirMesa(5);
        garcom.registrarPedido("2x Picanha, 1x Vinho");
        garcom.notificar("Pedido VIP urgente!");
        garcom.exibirResumoPedidos();
        garcom.liberarMesa();
    }

}
