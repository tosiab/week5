/*Tosia Bednarz
3/13/24
2:56*/
import java.util.*;
import java.text.NumberFormat;
public class Order {
    public static void main(String[]args){
        int bN;
        int fN;
        int sN;
        double tbt;
        double tax;
        double fT;
        int nT;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        input.next();
        System.out.print("Enter the number of burgers: ");
        bN = input.nextInt();
        System.out.print("Enter the number of fries: ");
        fN = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        sN = input.nextInt();
        tbt = (bN * 1.69)+(fN*1.09)+(sN*0.99);
        tax = tbt * 0.085;
        fT = tbt + tax;
        System.out.println("\nTotal before tax: "+(money.format(tbt)));
        System.out.println("Tax: "+(money.format(tax)));
        System.out.println("Final Total: "+(money.format(fT)));
        System.out.print("Enter the amount tendered: ");
        nT = input.nextInt();
        System.out.println("Change: "+(money.format(nT-fT)));
        input.close();


    }
    
}
