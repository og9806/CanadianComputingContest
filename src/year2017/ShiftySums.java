package year2017;
import java.util.*;

public class ShiftySums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int startNumber=sc.nextInt();
        int k=sc.nextInt();
        int total=0;
        int[] multipliers = new int[k+1];
        for(int i=0;i<k+1;i++){
            multipliers[i]=startNumber;
            startNumber*=10;
        }
        for(int j=0;j<k+1;j++){
            total+=multipliers[j];
        }
        System.out.println(total);
    }
}
