import java.util.Scanner;

public class Main
{

    public static int calculateSquarePerimeter(int squareWidth)
    {
        return  (squareWidth * 4);
    }

    public static int calculateSquareArea(int squareWidth)
    {
        return  (squareWidth * squareWidth);
    }

    public static int calculateRectanglePerimeter(int rectangleWidth, int rectangleHeight)
    {
        return  (2 * (rectangleWidth + rectangleHeight));
    }

    public static int calculateRectangleArea(int rectangleWidth, int rectangleHeight)
    {
        return  (rectangleWidth * rectangleHeight);
    }
    public static void main(String[] args)
    {
        int squareWidth = 0;
        int rectangleWidth = 0;
        int rectangleHeight = 0;
        int squareArea = 0;
        int squarePerimeter = 0;
        int rectangleArea = 0;
        int rectanglePerimeter = 0;
        Scanner scannerIn = new Scanner(System.in);

        //  get input

        System.out.print("Enter the width of the square: ");
        squareWidth = scannerIn.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        rectangleWidth = scannerIn.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        rectangleHeight = scannerIn.nextInt();

        // do calculations

        squarePerimeter = calculateSquarePerimeter(squareWidth);
        squareArea = calculateSquareArea(squareWidth);
        rectanglePerimeter = calculateRectanglePerimeter(rectangleWidth, rectangleHeight);
        rectangleArea = calculateRectangleArea(rectangleWidth, rectangleHeight);


        //display results

        System.out.println("The perimeter of the square is: " + squarePerimeter);
        System.out.println("The area of the square is: "+ squareArea);
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
        System.out.println("The area of the rectangle is: " + rectangleArea);

    }
}
