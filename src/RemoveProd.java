import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProd {
    public static void removeProd(ArrayList name, ArrayList price, ArrayList quant) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilken produkt vill du ta bort? ");
        String delete = scan.next();
        name.remove(delete.toLowerCase());
    }

public static void main (String[] args){

}
}

