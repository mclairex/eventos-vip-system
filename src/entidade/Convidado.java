 package entidade;

 //Usar bibliotecas
 
    public class Convidado {
        private int id;
        private String nome;
        private String tipo;

        public Convidado(int id, String nome, String tipo) {
            this.id = id;
            this.nome = nome;
            this.tipo = tipo;
        }

        // Getters e Setters
        public int getId() { return id; } 
        public void setId(int id) { this.id = id; }
        public String getNome() { return nome; } 
        public void setNome(String nome) { this.nome = nome; }
        public String getTipo() { return tipo; } 
        public void setTipo(String tipo) { this.tipo = tipo; }  

        //public Convidado(String nome, String tipo) {
        //    this.nome = nome;
        //    this.tipo = tipo;
        //    // Configuração da estratégia de desconto (DIP/OCP)
        //    if (tipo.equalsIgnoreCase("VIP")) {
        //        this.estrategiaDesconto = new DescontoVIP();
        //    } else {
        //        this.estrategiaDesconto = new DescontoRegular();
        //    }
        //}
//
        //public String getNome() { return nome; }
        //public String getTipo() { return tipo; }
        //public Desconto getEstrategiaDesconto() { return estrategiaDesconto; }
    }
}

