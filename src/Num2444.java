import java.util.Scanner;

public class Num2444 {
    public static void printSpace(){
        System.out.print(" ");
    }
    public static void printStar(){
        System.out.print("*");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if(count<=100&&count>=0){
            for(int i=0;i<((2*count-1)/2);i++){
                for(int k=0;k<(((2*count-2)/2)-i);k++){
                    printSpace();
                }
                for(int k=0;k<((2*count-1)-2*(((2*count-2)/2)-i));k++){
                    printStar();
                }
                System.out.println();
            }
            for(int i=((2*count-1)/2);i>=0;i--){
                for(int k=(((2*count-2)/2)-i);k>0;k--){
                    printSpace();
                }
                for(int k=((2*count-1)-2*(((2*count-2)/2)-i));k>0;k--){
                    printStar();
                }
                if(i!=0){
                    System.out.println();
                }
            }
        }
    }
}
