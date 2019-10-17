import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = readArray(5);

        System.out.println(findMin(arr));
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] readArray(int count){
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++){
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array){

        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        return min;
    }

    public static int findMinElement(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){

            int value = array[i];

            if (value < min){
                min = value;
            }
        }

        return min;
    }
}
