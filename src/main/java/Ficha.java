public abstract class Ficha {


    private String atributos;

    public Ficha(String atributos) {
        this.atributos = atributos;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    public abstract String getFicha();
}