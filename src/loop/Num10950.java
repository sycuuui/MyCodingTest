package loop;

import java.io.IOException;
import java.util.Scanner;

public class Num10950 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int[] list = new int[time];
        for(int i=0;i<time;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list[i] = a+b;
        }

        for(int x : list){
            System.out.println(x);
        }
    }
}
