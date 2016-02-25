package PrimeFactorPack;

import java.util.Scanner;

public class TestPrimeFactor {
    public static void main(String[] args){
        System.out.println("Please input a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(PrimeFactor.searchPrimeFactor(num));
    }
}
