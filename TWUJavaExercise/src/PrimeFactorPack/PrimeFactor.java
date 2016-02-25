package PrimeFactorPack;

import java.util.ArrayList;

public class PrimeFactor {
    static ArrayList primeFactors = new ArrayList();

    public static ArrayList<Integer> searchPrimeFactor(int input){
        if(!isPrime(input)){
            for(int i=2; i<input; i++){
                if(input%i == 0){
                    if(isPrime(i)){
                        primeFactors.add(i);
                    }
                }
            }
            return primeFactors;
        }else{
            return primeFactors;
        }
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }else{
            for(int i=2; i<num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
