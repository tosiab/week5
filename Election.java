import java.util.*;
import java.text.NumberFormat;
public class Election {
    public static void main(String[]args){
        int nyA;
        int nyM;
        int njA;
        int njM;
        int cA;
        int cM;
        int tA;
        int tM;
        double pA;
        double pM;
        NumberFormat percent= NumberFormat.getPercentInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("How many votes did Awbrey receive from New York? ");
        nyA = input.nextInt();
        System.out.print("How many votes did Martinez receive from New York? ");
        nyM = input.nextInt();
        System.out.print("How many votes did Awbrey receive from New Jersey? ");
        njA = input.nextInt();
        System.out.print("How many votes did Martinez receive from New Jersey? ");
        njM = input.nextInt();
        System.out.print("How many votes did Awbrey receive from Connecticut? ");
        cA = input.nextInt();
        System.out.print("How many votes did Martinez receive from Connecticut? ");
        cM = input.nextInt();
        tA = nyA + njA + cA;
        tM = nyM + njM + cM;
        pA = (double) tA/(tM+tA);
        pM = (double) tM/(tM+tA);
        input.close();

        System.out.println("Candidate\t\tVotes\tPercentage");
        System.out.println("Awbrey\t\t\t"+tA+"\t"+(percent.format(pA)));
        System.out.println("Martinez\t\t"+tM+"\t"+(percent.format(pM)));
        System.out.println("\nTotal Votes:\t\t"+ (tM+tA));

        



    }
}