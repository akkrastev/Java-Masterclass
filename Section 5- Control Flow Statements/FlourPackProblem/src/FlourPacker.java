public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigBag = bigCount * 5;
        int smallBag = smallCount;
        int remainBag = goal % 5;

        if ((bigBag + smallBag >= goal) && (remainBag <= smallBag)){
            return true;
        }
        else {
            return false;
        }
    }
}
