package loop;

import java.util.Scanner;

public class Num25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int kind = scanner.nextInt();
        int calculTotal=0;
        int [] list = new int[kind];
        for(int i=0;i<kind;i++){
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            list[i] = price*count;
        }
        for(int price2 : list){
            calculTotal+=price2;
        }
        if(total==calculTotal){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
