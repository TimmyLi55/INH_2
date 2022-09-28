public class Smartphone extends Product{
    private String title;
    private String madeIn;

    public Smartphone(int id, String name, int price, String title, String madeIn) {
        super(id, name, price);
        this.title = title;
        this.madeIn = madeIn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
