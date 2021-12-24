public class Classe {

    private Ficha heroi;

    public void setHeroi(Ficha heroi){
        this.heroi = heroi;
    }

    public String getHeroi(){
        if (this.heroi == null){
            throw new NullPointerException(("Classe sem herói"));
        }
        return this.heroi.getFicha();
    }
}