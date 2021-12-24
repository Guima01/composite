import java.util.ArrayList;
import java.util.List;

public class Player extends Ficha{

    private List<Ficha> fichas;

    public Player (String atributos){
        super(atributos);
        this.fichas = new ArrayList<Ficha>();
    }

    public void addFicha(Ficha ficha){
        this.fichas.add(ficha);
    }

    public String getFicha(){
        String saida = "";
        saida = "Player:" + this.getAtributos() + "\n";
        for(Ficha ficha : fichas){
            saida += ficha.getFicha();
        }
        return saida;
    }
}