package loop;

import java.util.Scanner;

public class Num2739 {
    public static void print(int num){
        for(int i=1;i<10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        print(num);
    }
}
