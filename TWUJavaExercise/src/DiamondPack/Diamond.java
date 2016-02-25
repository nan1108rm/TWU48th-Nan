package DiamondPack;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        System.out.println("Please enter the number of asterisk:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=num-1; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*num-2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
