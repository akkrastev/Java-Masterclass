public class DiagonalStar {


    public static void printSquareStar(int number) {
        if(number < 5)
            System.out.println("Invalid Value");
        else
            for (int row = 0; row < number; row++){
                for (int col = 0; col < number; col++){

                    if (row == 0 || row == (number - 1)) System.out.print("*");
                    else if (col == 0 || col ==(number - 1)) System.out.print("*");
                    else if (row == col) System.out.print("*");
                    else if (row == (number - col - 1)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
    }
}
