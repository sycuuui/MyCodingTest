package array;

import java.util.Scanner;

public class Num2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] nlist = new int[n][n];
        int [][] mlist = new int[m][m];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                nlist[i][k] = scanner.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int k=0;k<m;k++){
                mlist[i][k] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                System.out.print(nlist[i][k]+mlist[i][k]+" ");
            }
            System.out.println();
        }
    }
}
