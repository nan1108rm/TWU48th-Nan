package FizzBuzzPack;

public class FizzBuzzGame {
    int num;
    public FizzBuzzGame(int count){
        this.num = count;
    }

    public void fizzBuzz(){
        for(int i=1; i<=num; i++){
            if((i%3 == 0)&&(i%5 != 0)){
                System.out.println("Fizz");
            }else if((i%5 == 0)&&(i%3 != 0)){
                System.out.println("Buzz");
            }else if((i%5 == 0)&&(i%3 == 0)){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
    }
}