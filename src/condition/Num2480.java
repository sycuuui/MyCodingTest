package condition;

import java.util.Scanner;

public class Num2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a==b || b==c || a==c){
            if(a==b && b==c){
                System.out.println(10000+a*1000);
            }
            //같은 것만
            else if(a==b){
                System.out.println(1000+a*100);
            }else if(b==c) {
                System.out.println(1000 + b * 100);
            }else {
                System.out.println(1000+c*100);
            }

        }else {
            int max = a;
            if(b>max){
                max = b;
            }else if(c>max) {
                max = c;
            }
            System.out.println(max*100);
        }
    }
}
