package VertialAsterisk;

import java.util.Scanner;

public class DrawVerticalLine {
    public static void main(String[] args){
        System.out.println("Please enter the number of asterisk:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++) {
            System.out.print("*\n");
        }
    }
}

