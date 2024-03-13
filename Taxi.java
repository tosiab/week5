/* Tosia Bednarz
3/13/24
2:56*/
import java.util.*;
public class Taxi {
    public static void main(String[]args){
        int pa;
        int cabs;
        int leftover;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of passengers: ");
        pa = input.nextInt();
        cabs = pa/4;
        leftover = pa%4;
        System.out.println(cabs +" cabs are required");
        System.out.println(leftover+" passengers will be left over");
        input.close();


    }
    
}
