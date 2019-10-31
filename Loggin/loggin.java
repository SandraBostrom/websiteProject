import java.awt.*;
import java.util.Scanner;
public class loggin {

    public static void main (String[] args){
        password();
    }

    private static void password (){
        Scanner scan = new Scanner (System.in);
        System.out.println("Lösenord: ");
        if (scan.next().equalsIgnoreCase("hej")){
            System.out.println("Välkommen");

        }
        else{
            System.out.println("Felaktigt lösenord ");
        }

        }

}
