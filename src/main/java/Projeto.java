public class Projeto {

    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItem() {
        if (this.item == null) {
            throw new NullPointerException("Projeto sem item");
        }
        return this.item.getItem();
    }

}
