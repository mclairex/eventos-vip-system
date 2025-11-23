package entidade;

import Desconto.Desconto;
import Desconto.DescontoRegular;
import Desconto.DescontoVIP;

public class Convidado extends Pessoa {
    private String tipo;
    private Desconto estrategiaDesconto;

    public Convidado(Integer id, String nome, String tipo) {
        super(id, nome);
        this.tipo = tipo.toUpperCase();

        if (this.tipo.equals("VIP")) {
            this.estrategiaDesconto = new DescontoVIP();
        } else {
            this.estrategiaDesconto = new DescontoRegular();
        }
    }

    public String getTipo() {
        return tipo;
    } 
    
    public boolean isVIP() {
        return tipo.equals("VIP");
    }
    public double calcularValorFinal(double valor){
        return valor - calcularValorFinal(valor);
    }

    @Override
    public String toString(){
        return super.toString() + ", Tipo: " + tipo;
    }
}
