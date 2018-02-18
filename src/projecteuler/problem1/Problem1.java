package projecteuler.problem1;

public final class Problem1 {
    private static final int LIMIT = 1000;
    private static final int NUMBER_1 = 3;
    private static final int NUMBER_2 = 5;

    public static long calculate() {
        long sum = 0;
        for(int i = 0; i < LIMIT; i=i+NUMBER_1) {
            sum += i;
        }
        for(int i = 0; i < LIMIT; i=i+NUMBER_2) {
            if(i % NUMBER_1 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of all the multiples of "+NUMBER_1+" or "+NUMBER_2+" below "+LIMIT+" is "+calculate()+".");
    }
}