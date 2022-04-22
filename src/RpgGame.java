import java.util.Random;
import java.util.Scanner;

public class RpgGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first player name");
        String playerOneName = scanner.nextLine();
        System.out.println("Enter the second player name");
        String playerTwoName = scanner.nextLine();
        String helloMsg = "Time to attack press 1";
        String shopMessage = "Hey!\nI see u have earned some cash!\nDo u wanna buy some goods?" +
                "\n1 - Sword (will give u + 5 damage) - cost: 100\n2 - shield (u will get 5 less damage)" +
                " - cost: 100\n3 - armor (u will have 50 health more) - cost: 300\n4 - lucky amulet" +
                " (ur critical chance will grow from 25% to 40%) - cost:400\n5 - don't " +
                "buy anything\n6 - exit from the game";
        int balancePlayerOne = 0;
        int balancePlayerTwo = 0;

        int playerOneBuyTime;
        int playerTwoBuyTime;

        int minAttackPlayerOne = 1;
        int maxAttackPlayerOne = minAttackPlayerOne + 10;
        int minAttackPlayerTwo = 1;
        int maxAttackPlayerTwo = minAttackPlayerTwo + 10;
        int playerOneAttack;
        int playerTwoAttack;
        boolean playerOneCriticalAttack;
        boolean playerTwoCriticalAttack;
//        if (playerOneCriticalAttack) {
//            playerOneAttack *= 2;
//            System.out.println(playerOneName + " has critical hit");
//        } else if (playerTwoCriticalAttack) {
//            playerTwoAttack *= 2;
//            System.out.println(playerTwoName + " has critical hit");
//        }
//        System.out.println(helloMsg);
//        scanner.next();

        //  ссылка на статью:
        // https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
        while (true) {
            int playerOneHealth = 100;
            int playerTwoHealth = 100;
            while (true) {
                System.out.println(helloMsg);
                scanner.next();
//                playerOneAttack = (int) ((Math.random() * (maxAttackPlayerOne - minAttackPlayerOne))
//                        + minAttackPlayerOne);
//                playerTwoAttack = (int) ((Math.random() * (maxAttackPlayerTwo - minAttackPlayerTwo))
//                        + minAttackPlayerTwo);
                playerOneAttack = 10;
                playerTwoAttack = 2;
                playerOneCriticalAttack = new Random().nextInt(7) == 0;
                playerTwoCriticalAttack = new Random().nextInt(7) == 0;
                if (playerOneCriticalAttack) {
                    playerOneAttack *= 2;
                    System.out.println(playerOneName + " has critical hit");
                } else if (playerTwoCriticalAttack) {
                    playerTwoAttack *= 2;
                    System.out.println(playerTwoName + " has critical hit");
                }
                playerOneHealth -= playerTwoAttack;
                playerTwoHealth -= playerOneAttack;

                System.out.println(playerOneName + " gets " + playerTwoAttack + " damage, " + "now "
                        + playerOneName + "'s health = " + playerOneHealth);
                System.out.println(playerTwoName + " gets " + playerOneAttack + " damage, " + "now "
                        + playerTwoName + "'s health = " + playerTwoHealth);

                if (playerOneHealth <= 0 && playerTwoHealth > 0) {
                    System.out.println(playerTwoName + " wins !");
                    System.out.println(" ");
                    balancePlayerTwo += 200;
                    System.out.println(playerTwoName + "'s balance now is " + balancePlayerTwo);
                    break;
                } else if (playerTwoHealth <= 0 && playerOneHealth > 0) {
                    System.out.println(playerOneName + " wins !");
                    System.out.println(" ");
                    balancePlayerOne += 200;
                    System.out.println(playerOneName + "'s balance now is " + balancePlayerOne);
                    break;
                } else if (playerOneHealth <= 0 && playerTwoHealth <= 0) {
                    balancePlayerOne += 100;
                    balancePlayerTwo += 100;
                    System.out.println("DRAW !!!!");
                    System.out.println(playerTwoName + "'s balance now is " + balancePlayerTwo);
                    System.out.println(playerOneName + "'s balance now is " + balancePlayerOne);
                    break;
                }
            }

            if (balancePlayerOne <= 0) {
                System.out.println(playerOneName + " sorry, but u haven't money");
            } else if (balancePlayerTwo <= 0) {
                System.out.println(playerTwoName + " sorry, but u haven't money");
            }

            while (balancePlayerOne > 0) {
                System.out.println(playerOneName + " has " + balancePlayerOne);
                System.out.println(shopMessage);
                System.out.println(playerOneName + "'s turn to buy");
                playerOneBuyTime = scanner.nextInt();
                switch (playerOneBuyTime) {
                    case 1:
                        balancePlayerOne -= 100;
                        playerOneAttack += 5;
                        continue;
                    case 2:
                        balancePlayerOne -= 100;
                        playerTwoAttack -= 5;
                        continue;
                    case 3:
                        balancePlayerOne -= 300;
                        playerOneHealth += 50;
                        continue;
                    case 4:
                        balancePlayerOne -= 400;
                        playerOneCriticalAttack = new Random().nextInt(5) == 0;
                        continue;
                    case 5:
                        break;
                    default:
                }
            }
            System.out.println(shopMessage);
            playerTwoBuyTime = scanner.nextInt();
            while (balancePlayerTwo > 0 || playerTwoBuyTime != 5) {
                System.out.println(playerTwoName + " has " + balancePlayerTwo);
                System.out.println(playerTwoName + "'s turn to buy");
                playerTwoBuyTime = scanner.nextInt();
                switch (playerTwoBuyTime) {
                    case 1:
                        balancePlayerTwo -= 100;
                        playerTwoAttack += 5;
                        continue;
                    case 2:
                        balancePlayerTwo -= 100;
                        playerOneAttack -= 5;
                        continue;
                    case 3:
                        balancePlayerTwo -= 300;
                        playerTwoHealth += 50;
                        continue;
                    case 4:
                        balancePlayerTwo -= 400;
                        playerTwoCriticalAttack = new Random().nextInt(5) == 0;
                        continue;
                    case 5:
                        break;
                    default:
                }
            }
//        String exit = scanner.nextLine();
//        if (exit.equals("exit")) {
//            break;
//        }
        }
    }
}

//        System.out.println("Game over");
