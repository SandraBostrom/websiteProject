import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddProd {
    static Scanner scan = new Scanner (System.in);

    public static void addProd(ArrayList names, ArrayList prices, ArrayList quants){
        Item newItem = new Item();

        System.out.println("Ange produktens namn:");
    newItem.setName(scan.nextLine());
    names.add(newItem.getName().toLowerCase());
    System.out.println("Ange produktens pris: ");
    newItem.setPrice(scan.nextInt());
    prices.add(newItem.getPrice());
    System.out.println("Ange hur många som finns");
    newItem.setAmount(scan.nextInt());
    quants.add(newItem.getAmount());
    }


    public static void main (String [] args ) {
        ArrayList<String> prodName = new ArrayList<String>();
        ArrayList<Integer> prodPrice = new ArrayList<Integer>();
        ArrayList<Integer> prodQuant = new ArrayList<Integer>();
    do {
        addProd(prodName, prodPrice, prodQuant);
        System.out.println("Vill du lägga till en till produkt?");
        scan.nextLine();
        System.out.println("Tillagda produkter " + prodName.toString());
    }
    while (scan.nextLine().equalsIgnoreCase("Ja"));
    {
    }


    }
}
