import java.text.DecimalFormat;

public class GroceryItem {
    private Product product;
    private int quantity;

    public GroceryItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getCost(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return quantity + " " + product.getName() + " " + numberFormat.format(getCost()) + " DKK";
    }
}
