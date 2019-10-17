public class NumberToWords {

    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
        else {

            int reversedNumber = reverse(number);
            int temp = reversedNumber;

            while (reversedNumber != 0) {

                int lastDigit = reversedNumber % 10;
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                        break;
                }

                reversedNumber /= 10;
            }

            int leadingZeros = getDigitCount(number) - getDigitCount(temp);
            while (leadingZeros > 0){
                System.out.println("Zero");
                leadingZeros--;
            }
        }
    }

    public static int reverse(int n){

        int reversedNum = 0;
        int lastDigit;

        if (n == 0){
            return 0;
        }
        while (n != 0){
            lastDigit = n % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            n /= 10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number){

        int count = 0;
        if (number < 0){
            return -1;
        }
        else if (number == 0){
            return 1;
        }else {
            while (number != 0) {
                int lastDigit = number % 10;
                count++;
                number /= 10;
            }

            return count;
        }
    }
}
