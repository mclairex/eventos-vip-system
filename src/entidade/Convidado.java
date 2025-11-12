 package entidade;

import desconto.Desconto;
import desconto.DescontoRegular;
import desconto.DescontoVIP;

    public class Convidado {
        private String nome;
        private String tipo;
        private Desconto estrategiaDesconto;

        public Convidado(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
            // Configuração da estratégia de desconto (DIP/OCP)
            if (tipo.equalsIgnoreCase("VIP")) {
                this.estrategiaDesconto = new DescontoVIP();
            } else {
                this.estrategiaDesconto = new DescontoRegular();
            }
        }

        public String getNome() { return nome; }
        public String getTipo() { return tipo; }
        public Desconto getEstrategiaDesconto() { return estrategiaDesconto; }
    }
}

