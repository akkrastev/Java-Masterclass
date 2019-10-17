public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        if ((int)(firstNum * 1000) == (int)(secondNum * 1000)){
            return true;
        }

        return false;
    }
}
