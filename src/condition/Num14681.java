package condition;

import java.util.Scanner;

public class Num14681 {
    public static int check(int x, int y){
        if(x>0){
            if(y>0){
                return 1;
            }
            return 4;
        }else {
            if(y>0){
                return 2;
            }
            return 3;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(check(x,y));
    }
}
