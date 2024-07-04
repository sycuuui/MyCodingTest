package condition;

import java.util.Scanner;

public class Num2525 {
    public static String oven(int h,int m,int time){
        if((m+time)>=60){
            if((h+((m+time)/60))>23){
                return (24-(h+((m+time)/60)))+" "+(m+time)%60;
            }
            return (h+((m+time)/60))+" "+(m+time)%60;
        }else{
            return h+" "+(m+time);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(oven(h,m,time));
    }
}
