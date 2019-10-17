public class SecondsAndMinutes {

    public static void getDurationString(int minutes, int seconds){

        if (minutes < 0 || seconds < 0 ||  seconds > 59){
            System.out.println("Invalid value");
        }
        else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "h";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }

            System.out.println(hoursString + " " + minutesString + " " + secondsString);
        }
    }

    public static void getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid Value");

        }
        else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            getDurationString(minutes, remainingSeconds);
        }
    }
}
