public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){

        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)){
            return false;
        }

        int leftNum1 = num1 / 10;
        int rightNum1 = num1 % 10;
        int leftNum2 = num2 / 10;
        int rightNum2 = num2 % 10;

        if ((leftNum1 == leftNum2) || (leftNum1 == rightNum2) || (rightNum1 == leftNum2) || (rightNum1 == rightNum2)){
            return true;
        }else {
            return false;
        }
    }
}
