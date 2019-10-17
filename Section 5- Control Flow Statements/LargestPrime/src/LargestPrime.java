import java.util.ArrayList;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        ArrayList<Integer> allFactors = getAllFactors(number);
        int largestPrimeFactor = 0;

        for (int factor : allFactors) {

            if (isPrimeNumber(factor) && factor > largestPrimeFactor) {
                largestPrimeFactor = factor;
            }
        }

        return largestPrimeFactor;
    }

    public static ArrayList<Integer> getAllFactors(int number){

        ArrayList<Integer> allFactors = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                allFactors.add(i);
            }
        }

        return allFactors;

    }

    public static boolean isPrimeNumber(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getLargestPrime2(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrimeFactor;
        for (largestPrimeFactor = 2; largestPrimeFactor <= number; largestPrimeFactor++) {

            if (number % largestPrimeFactor == 0) {
                number /= largestPrimeFactor;
                largestPrimeFactor--;
            }
        }

        return largestPrimeFactor;
    }
}