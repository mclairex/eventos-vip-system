import entidade.Garcom;
import entidade.Pedido;
import entidade.Mesa;
import entidade.Convidado;
import entidade.ItemMenu;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("=== SISTEMA EVENTOS VIP - DEMONSTRACAO ===");
            System.out.println();

            // 1. Criar garcom
            Garcom garcom = new Garcom(1, "Joao");
            System.out.println("Garcom criado: " + garcom.getNome());

            // 2. Criar mesa
            Mesa mesa = new Mesa(5);
            System.out.println("Mesa criada: " + mesa.getNumero());

            // 3. Adicionar convidados
            Convidado convidadoVIP = new Convidado(1, "Maria Silva", "VIP");
            Convidado convidadoRegular = new Convidado(2, "Jose Santos", "Regular");

            mesa.adicionarConvidado(convidadoVIP);
            mesa.adicionarConvidado(convidadoRegular);
            System.out.println("Convidados adicionados: " + mesa.getConvidados().size() + " convidados");

            // 4. Garcom atribui mesa
            garcom.atribuirMesa(mesa.getNumero());
            System.out.println("Garcom atribuido a mesa");

            // 5. Criar itens do cardapio
            ItemMenu picanha = new ItemMenu(1, "Picanha Grelhada", "Refeicao", 80.0, false);
            ItemMenu vinhoVIP = new ItemMenu(2, "Vinho Reserva Especial", "Bebida", 120.0, true);
            ItemMenu agua = new ItemMenu(3, "Agua Mineral", "Bebida", 8.0, false);

            System.out.println();
            System.out.println("Cardapio criado:");
            System.out.println("  - " + picanha);
            System.out.println("  - " + vinhoVIP);
            System.out.println("  - " + agua);

            // 6. Criar pedido
            Pedido pedido = new Pedido(mesa);
            pedido.adicionarItem(picanha);
            pedido.adicionarItem(vinhoVIP); // Item VIP - permitido porque tem convidado VIP
            pedido.adicionarItem(agua);
            pedido.setObservacao("Pedido especial para aniversariante");
            mesa.adicionarPedido(pedido);

            System.out.println();
            System.out.println("Pedido criado: " + pedido);

            // 7. Registrar pedido no garcom
            garcom.registrarPedido(pedido);

            // 8. Notificar garcom
            garcom.notificar("Pedido VIP pronto para servir!");

            // 9. Calcular conta total
            // Na Main, antes da linha que calcula a conta:
            mesa.debugConta();
            double contaTotal = mesa.calcularContaTotal();
            System.out.println();
            System.out.println("CONTA DA MESA:");
            System.out.println("  - Subtotal: R$ " + pedido.calcularTotal());
            System.out.println("  - Desconto VIP (10%): R$ " + convidadoVIP.getValorDesconto(pedido.calcularTotal()));
            System.out.println("  - TOTAL: R$ " + String.format("%.2f", contaTotal));

            // 10. Exibir resumo
            System.out.println();
            System.out.println("RESUMO FINAL:");
            System.out.println("  - Mesa: " + mesa);
            System.out.println("  - Decoracao: " + mesa.getDecoracao());
            System.out.println("  - Garcom: " + garcom);
            System.out.println("  - Pedidos registrados: " + garcom.getPedidosRegistrados().size());

            // 11. Liberar mesa
            garcom.liberarMesa();
            System.out.println();
            System.out.println("Mesa liberada - Garcom disponivel");

            System.out.println();
            System.out.println("DEMONSTRACAO CONCLUIDA COM SUCESSO!");

        } catch (Exception e) {
            System.out.println("Erro no sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}