package print_1;

import java.util.Scanner;

public class Num1000 {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));
    }
}
