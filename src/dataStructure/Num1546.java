package dataStructure;

import java.util.Scanner;

public class Num1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjectNum =scanner.nextInt();
        int scores[] = new int[subjectNum];
        for(int i=0;i<subjectNum;i++){
            int score = scanner.nextInt();
            scores[i]=score;
        }
        long max = scores[0];
        long sum=0;
        //최댓값 찾기
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
            sum=sum+score;
        }
        //새로운 평균 갖기
        System.out.println(sum*100.0/max/subjectNum);
    }
}
