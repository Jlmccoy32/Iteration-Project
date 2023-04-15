public class Produce{
    String fruitName;
    int quantity;
    double price;
    boolean inSeason;
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isInSeason() {
        return inSeason;
    }
    public void setInSeason(boolean inSeason) {
        this.inSeason = inSeason;
    }
    public Produce(String fruitName, int quantity, double price, boolean inSeason) {
        this.fruitName = fruitName;
        this.quantity = quantity;
        this.price = price;
        this.inSeason = inSeason;
    } 
}
    
    