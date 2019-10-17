public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int tempreture){

        if (summer){
            if (tempreture >= 25 && tempreture <= 45){
                return true;
            }
            return false;
        }
        else {
            if (tempreture >= 25 && tempreture <= 35){
                return true;
            }
            return false;
        }


    }
}
