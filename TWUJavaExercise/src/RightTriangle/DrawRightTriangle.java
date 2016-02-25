package RightTriangle;

import java.util.Scanner;

public class DrawRightTriangle {
    public static void main(String[] args){
        System.out.println("Please enter the number of asterisk:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}