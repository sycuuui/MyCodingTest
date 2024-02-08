package dataStructure;

import java.util.Scanner;

public class Num11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String sNum = scanner.next();
        char [] cNum = sNum.toCharArray();
        int sum=0;
        if(num==cNum.length){
            for (char c : cNum) {
                sum += c - '0';
            }
            System.out.println(sum);
        }else {
            System.out.println("길이에 맞게 다시 입력하세요");
        }
    }
}
