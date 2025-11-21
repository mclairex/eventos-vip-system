public class ItemMenu {
    public String nomeProduto;
    public String categoria;
    public String descricao;
    public double preco;
    public boolean isExclusivoDoVip;

    public ItemMenu(String nomeProduto, String categoria, String descricao, double preco, boolean isExclusivoDoVip) {
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.isExclusivoDoVip = isExclusivoDoVip;
    }
}
