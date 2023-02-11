package year2017;
import java.util.*;

public class ExactlyElectrical {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int s=sc.nextInt();
        char i=' ';
        int d=Math.abs(x2-x1)+Math.abs(y2-y1);
        double x=(s-d);
        if(x1==x2||y1==y2){
            if(x/2-((int) (x/2))==0){
                i='Y';
            }else{
                i='N';
            }
        }
        else{
            if(s<d){
                i='N';
            }else{
                if(s==d){
                    i='Y';
                }else{
                    if(x/2-((int) (x/2))==0){
                        i='Y';
                    }else{
                        i='N';
                    }
                }
            }
        }
        System.out.println(i);
    }
}
