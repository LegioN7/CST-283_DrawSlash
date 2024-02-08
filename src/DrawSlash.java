// Delta College - CST 283 - Homework 1
// Name:  Aaron Pelto
// Winter 2024


//DrawSlash will draw a slash based on the size and direction
//The parameters of the drawSlash method is that the size must be greater than or equal to 2
//The direction must be L or R

public class DrawSlash
{

    final static String DRAW_LINE = "------------";
    public static void main(String[] args)
    {
        drawSlash(3,"L");
        System.out.println(DRAW_LINE);
        drawSlash(4,"R");
        System.out.println(DRAW_LINE);
        drawSlash(8,"L");
        System.out.println(DRAW_LINE);
        drawSlash(5,"R");
        System.out.println(DRAW_LINE);
        drawSlash(1,"R");
        System.out.println(DRAW_LINE);
        drawSlash(12,"L");
        System.out.println(DRAW_LINE);
        drawSlash(3,"X");
        System.out.println(DRAW_LINE);
    }

    /*
     Method drawSlash
     This method draws the slash from the size input and direction input
     Precondition: size is an integer and direction is a string
    */


    public static void drawSlash(int size, String direction) {
        if (size < 2) {
            System.out.println("Size must be greater than or equal to 2");
        } else if (direction.equals("L")) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } else if (direction.equals("R")) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    else {
        System.out.println("?");
    }
}
}