package projecteuler.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Problem3 {
    private static final long NUMBER = 600_851_475_143L;

    public static List<Long> primeFactors(long numbers) {
        long n = numbers;
        List<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static long calculate() {
        return Collections.max(primeFactors(NUMBER));
    }

    public static void main(String[] args) {
        System.out.println("The largest prime factor of the number "+NUMBER+" is "+calculate()+".");
    }
}