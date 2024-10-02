package daily.day2;

import java.util.Scanner;

public class Num3 {
    // 구간합 배열을 생성하는 메서드
    public static int[] createSumArray(int[] arr) {
        int[] sumArray = new int[arr.length]; // 구간합 배열
        for (int i = 1; i < arr.length; i++) {
            sumArray[i] = sumArray[i - 1] + arr[i];
        }
        return sumArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int dataNum = scanner.nextInt(); // 배열 크기
        int queryNum = scanner.nextInt(); // 구간합을 구할 쿼리 개수

        // 데이터를 담을 배열 (1-based 인덱싱을 사용하기 위해 +1)
        int[] array = new int[dataNum + 1];
        for (int i = 1; i <= dataNum; i++) {
            array[i] = scanner.nextInt();
        }

        // 구간합 배열 생성
        int[] sumArray = createSumArray(array);

        // 쿼리 처리
        for (int k = 0; k < queryNum; k++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(sumArray[b] - sumArray[a - 1]);
        }

        scanner.close();
    }
}
