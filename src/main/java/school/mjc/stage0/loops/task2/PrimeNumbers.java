package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for(int i = 2; i<=printToInclusive; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    boolean isPrime(int num){
        if(num == 0)
            return false;
        for(int i = 2; i<num; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
