import java.util.Scanner;

public class LuckyNumberGame {
    public static void main(String[] args) {
            final int LUCKY_NUMBER = 1 + (int) (Math.random() * 9);

            Scanner scanner = new Scanner(System.in);

//            while(true) {
//                System.out.println("Enter number: ");
//                int userNumber = scanner.nextInt();
//
//                if(userNumber == LUCKY_NUMBER) {
//                    System.out.println("You win");
//                    break;
//                }else if (userNumber != LUCKY_NUMBER) {
//                    System.out.println("Try again");
//                }
//            }
        for (int i = 1; i <= 4; i++){
            System.out.println("Enter number: ");
            int userNumber = scanner.nextInt();
            if (i == 4 && userNumber != LUCKY_NUMBER){
                System.out.println("Try again");
                break;
            }else if (userNumber == LUCKY_NUMBER){
                System.out.println("You win");
                break;
            }else if (userNumber != LUCKY_NUMBER){
                System.out.println("Try again");
            }else if (i == 4 && userNumber == LUCKY_NUMBER){
                System.out.println("You win");
            }
        }
            System.out.println("Game Over !");
    }
}
