public class Classe extends Item{

    private String tipo;

    public Classe(String descricao, String tipo) {
        super(descricao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getItem() {
        return "Classe: " + this.getDescricao() + " - Tipo: " + this.tipo + "\n";
    }
}
