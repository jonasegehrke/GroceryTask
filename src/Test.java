import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        //Adding store selection from txt file
        ArrayList<Product> listOfProducts = new ArrayList(); //saving all products in an arraylist
        try {
            File myFile = new File("catalogue.txt");    //Creating new file
            Scanner myReader = new Scanner(myFile);             //Creating scanner to file
            while (myReader.hasNextLine()){                     //reading file
                String[] bits = myReader.nextLine().split(" ");     //Split each line into array
                listOfProducts.add(new Product(bits[0], Double.parseDouble(bits[1])));      //Create product
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        //Creating the GroceryList
        GroceryList list = new GroceryList();

        //adding groceries to the list
        list.add(new GroceryItem(listOfProducts.get(0), 2));
        list.add(new GroceryItem(listOfProducts.get(1),1));
        list.add(new GroceryItem(listOfProducts.get(2),1));
        list.add(new GroceryItem(listOfProducts.get(3),3));
        list.add(new GroceryItem(listOfProducts.get(4),2));
        list.add(new GroceryItem(listOfProducts.get(5),4));

        //Print to console
        System.out.println("This is your Grocery list");
        for(int i = 0; i < list.getList().size(); i++){
            System.out.println(list.getList().get(i));
        }
        System.out.println("Total: " + list.getTotalCost() + " DKK");


    }
}
