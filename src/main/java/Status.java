public class Status extends Ficha{

    private String statusAtributos;

    public Status(String atributos, String statusAtributos){
        super(atributos);
        this.statusAtributos = statusAtributos;
    }

    public String getStatusAtributos() {
        return statusAtributos;
    }

    public void setStatusAtributos(String statusAtributos) {
        this.statusAtributos = statusAtributos;
    }

    public String getFicha() {
        return "Status: " + this.getAtributos() + ": " + this.statusAtributos + "\n";
    }

}