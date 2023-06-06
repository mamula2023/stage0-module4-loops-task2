package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int starting = 1;
        int i = 1;
        System.out.println(starting);
        while(i<=printToInclusive){
            starting *= i;
            System.out.println(starting);
            i++;
        }
    }
}
