public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;
        while (number != 0){
            int evenDigit = number % 10;

            if (evenDigit % 2 == 0){
                sum += evenDigit;
            }

            number /= 10;
        }

        return sum;
    }
}
