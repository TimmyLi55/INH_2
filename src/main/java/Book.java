public class Book extends Product {
    protected String tile;
    protected String autor;

    public Book(int id, String name, int price, String tile, String autor) {
        super(id, name, price);
        this.tile = tile;
        this.autor = autor;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
