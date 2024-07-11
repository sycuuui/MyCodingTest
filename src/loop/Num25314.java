package loop;

import java.util.Scanner;

public class Num25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int time = 0;
        while ((n/2)==1 || (n/2)==0){
            n = n/2;
            time++;
        }
        for(int i=0;i<time;i++){
            System.out.println("long");
        }
        System.out.println("int");
    }
}
