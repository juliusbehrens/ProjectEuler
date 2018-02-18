package projecteuler.problem2;

public final class Problem2 {
    private static final long LIMIT = 4_000_000;

    public static long calculate() {
        long previousFibonacci = 0;
        long beforePreviousFibonacci = 0;
        long sum = 0;
        for(long currentFibonacci = 1; currentFibonacci < LIMIT; currentFibonacci = beforePreviousFibonacci+previousFibonacci) {
            //System.out.println(currentFibonacci);
            if(currentFibonacci % 2 == 0) {
                sum += currentFibonacci;
            }
            beforePreviousFibonacci = previousFibonacci;
            previousFibonacci = currentFibonacci;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed "+LIMIT+", the sum of the even-valued terms is "+calculate()+".");
    }
}