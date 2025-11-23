package entidade;

public abstract class Pessoa {
    protected Integer id;
    protected String nome;

    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {  // ✅ CORRIGIDO: getNone → getNome
        return nome;
    }

    public void setNome(String nome) {  // ✅ CORRIGIDO: setNone → setNome
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome;  // ✅ CORRIGIDO: None → Nome
    }
}