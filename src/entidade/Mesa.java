package entidade;

import java.util.List;

public class Mesa {
    private Integer numero;
    private Garcom garcom;
    private List<Convidado> convidadoList;

    public Mesa(Integer numero, Garcom garcom, List<Convidado> convidadoList) {
        this.numero = numero;
        this.garcom = garcom;
        this.convidadoList = convidadoList;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(List<Convidado> convidadoList) {
        this.convidadoList = convidadoList;
    }

    public List<Convidado> getConvidadoList() {
        return convidadoList;
    }

    public void setConvidadoList(List<Convidado> convidadoList) {
        this.convidadoList = convidadoList;
    }


//    public Double fecharConta() {
//        Double valorAPagar = 0.0;
//
//        for (Convidado c : convidadoList) {
//            if (c.isVip) {
//                desconto = 10.0;
//            }
//            List<Pedido> comanda = c.pedidoList;
//            for (Pedido p : comanda) {
//                valorAPagar += p.preco;
//            }
//        }
//    }
}
