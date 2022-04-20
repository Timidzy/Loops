import java.util.Scanner;

public class castleIf {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String helloMessage = "Hello, enter some options:";
        String holeHeightMessage = "Height of hole";
        String holeWidthMessage = "Width of hole";
        String brickHeightMessage = "Height of brick";
        String brickWidthMessage = "Width of brick";
        String brickLengthMessage = "Length of brick";
        System.out.println(helloMessage + "\n" + holeHeightMessage);
        int holeHeight = myScan.nextInt();
        System.out.println(holeWidthMessage);
        int holeWidth = myScan.nextInt();
        System.out.println(brickHeightMessage);
        int brickHeight = myScan.nextInt();
        System.out.println(brickWidthMessage);
        int brickWidth = myScan.nextInt();
        System.out.println(brickLengthMessage);
        int brickLength = myScan.nextInt();
        int holePerimeter = (holeHeight + holeWidth) * 2;
        int brickPerimeterOne = (brickHeight + brickLength) * 2;
        int brickPerimeterTwo = (brickHeight + brickWidth) * 2;
        int brickPerimeterThree = (brickLength + brickWidth) * 2;
        if((holePerimeter >= brickPerimeterOne) || (holePerimeter >= brickPerimeterTwo)
                || (holePerimeter >= brickPerimeterThree)){
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
