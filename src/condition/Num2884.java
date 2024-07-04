package condition;

import java.util.Scanner;

public class Num2884 {
    public static String clock(int h, int m){
        if((m-45)<0){
            if((h-1)<0){
                return (23-h) +" "+ (15 + m);
            }
            return h - 1 +" "+ (15 + m);
        }
        return h+" "+(m-45);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(clock(h,m));
    }
}
