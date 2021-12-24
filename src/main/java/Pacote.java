import java.util.ArrayList;
import java.util.List;

public class Pacote extends Item{

    private List<Item> itens;

    public Pacote(String descricao) {
        super(descricao);
        this.itens = new ArrayList<Item>();
    }

    public void addItem(Item conteudo) {
        this.itens.add(conteudo);
    }

    public String getItem() {
        String saida = "";
        saida = "Pacote: " + this.getDescricao() + "\n";
        for (Item item : itens) {
            saida += item.getItem();
        }
        return saida;
    }
}