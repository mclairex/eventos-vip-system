public class DescontoVIP implements Desconto {
    private static final double TAXA_DESCONTO = 0.10; // 10%

    @Override
    public double calcularDesconto(double valor) {
        // Valor do desconto (10% de desconto)
        return valor * TAXA_DESCONTO;
    }
}

public class DescontoRegular implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return 0.0; // 0% de desconto
    }
}


