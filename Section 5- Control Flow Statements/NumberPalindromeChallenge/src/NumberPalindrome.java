public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int num = number;

        if (number == 0){
            return true;
        }

        while (number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if (reverse == num){
            return true;
        }
        else {
            return false;
        }

    }
}
