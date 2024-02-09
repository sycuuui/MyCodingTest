package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num10807 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=100 && n>=1){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                int num = scanner.nextInt();
                if(num<=100 && num>=-100){
                    list.add(num);
                }
            }
            int findNum = scanner.nextInt();
            int count = 0;
            for (Integer i: list) {
                if(findNum == i){
                    count++;
                }
            }
            System.out.println(count);
        }else {
            System.out.println("n이 범위에 벗어났습니다");
        }
    }
}
