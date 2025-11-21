package entidade;

public class ConvidadoVIP extends Convidado {
    private int id;
    private String nome;
    private String tipo;

    public ConvidadoVIP(int id, String nome, String tipo) {
        super(id, nome);
        super.setTipo("VIP");
    }

    // Getters e Setters
    public int getId() { return id; } 
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; } 
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; } 
    public void setTipo(String tipo) { this.tipo = tipo; }
    
}
