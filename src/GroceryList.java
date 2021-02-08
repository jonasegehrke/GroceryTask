import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItem> list = new ArrayList();
    private double totalCost;

    public GroceryList(){
    }

    public void add(GroceryItem item){
        list.add(item);
        totalCost += item.getCost();
    }

    public double getTotalCost(){
        return totalCost;
    }

    public ArrayList<GroceryItem> getList(){
        return list;
    }


}
