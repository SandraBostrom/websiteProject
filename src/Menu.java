import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main (String[] args) {
        ArrayList prodName = new ArrayList<String>();
        ArrayList prodPrice = new ArrayList<Integer>();
        ArrayList prodQuant = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Vill du lägga till en produkt, tryck 1.\nTa bort en produkt,tryck 2. \nSe produkter i lager, tryck 3");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    AddProd.addProd(prodName, prodPrice, prodQuant);
                    System.out.println("Produkten är nu tillagd.\nVill du fortsätta? ");
                    scan.nextLine();
                    break;
                case 2:
                    RemoveProd.removeProd(prodName, prodPrice, prodQuant);
                    System.out.println("Produkten är nu borttagen \n Vill du fortsätta?");
                    break;
                case 3:
                    System.out.println("Dessa produkter finns tillagda: " + prodName.toString() + " \nVill du fortsätta");
                    break;
            }
        }
        while (scan.nextLine().equalsIgnoreCase("Ja"));
        {
        }

    }
}

