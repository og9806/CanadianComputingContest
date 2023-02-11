package year2017;
import java.util.*;

public class FavoriteTimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int hour1=1;
        int hour2=2;
        int minute1=0;
        int minute2=0;
        int duration=sc.nextInt();
        int hours=(duration-duration%60)/60;
        int minutes=duration%60;
        int specials=0;
        for(int i=0;i<duration;i++){
            minute2+=1;
            if(minute2==10){
                minute1+=1;
                minute2=0;
            }
            if(minute1==6){
                hour2+=1;
                minute1=0;
            }
            if(hour2==10&&hour1==0){
                hour1+=1;
                hour2=0;
            }
            if(hour2==3&&hour1==1){
                hour1=0;
                hour2=1;
            }
            int a=hour1-hour2;
            int b=hour2-minute1;
            int c=minute1-minute2;
            if(a==b&&a==c&&b==c&&hour1==1){
                specials+=1;
            }
            if(b==c&&hour1==0){
                specials+=1;
            }
        }
        System.out.println(specials);
    }
}
