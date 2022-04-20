import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        final String espresso = "Espresso";
        final String americano = "Americano";
        final String cappuccino = "Cappuccino";
        final String latte = "Latte";
        char gram = 'g';
        String ml = "ml";
        String chooseMessage = "You chase ";
        String waterRemainderMessage = "Remainder of water is ";
        String beansRemainderMessage = "Remainder of beans is ";
        String milkRemainderMessage = "Remainder of milk is ";
        String sugarRemainderMessage = "Remainder of sugar is ";
        String helloChooseMessage = "Choose coffee u would like to drink\n1 - espresso\n2 - americano\n" +
                "3 - cappuccino\n4 - latte\n5 - exit";

        double milk = 1000;
        double beans = 400;
        double water = 3000;
        double sugar = 200;

        //espresso - water 20, beans 4
        //americano - water 50, beans 4
        //cappuccino - water 90, beans 4, milk 40
        //latte - water 100, beans 5, milk 50
        System.out.println("Hello!");
        while (true) {
            System.out.println(helloChooseMessage);
            int coffee = myScan.nextInt();
            double sugarAmount = 1 + (int) (Math.random() * 19);
            //if (sugar < sugarAmount){
            //System.out.println("Please repeat and choose amount less than 200g");
            //}else
            if (coffee == 5) {
                break;
            } else if (sugar == 0 || water == 0 || beans == 0 || milk == 0){
                break;
            }


            switch (coffee) {
                case 1:
                    System.out.println(chooseMessage + espresso);
                    water -= 20;
                    beans -= 4;
                    sugar -= sugarAmount;
                    break;
                case 2:
                    System.out.println(chooseMessage + americano);
                    water -= 50;
                    beans -= 4;
                    sugar -= sugarAmount;
                    break;
                case 3:
                    System.out.println(chooseMessage + cappuccino);
                    water -= 90;
                    beans -= 4;
                    milk -= 40;
                    sugar -= sugarAmount;
                    break;
                case 4:
                    System.out.println(chooseMessage + latte);
                    water -= 100;
                    beans -= 5;
                    milk -= 50;
                    sugar -= sugarAmount;
                    break;
                default:
                    System.out.println("Error !");

            }



        }
        System.out.println(waterRemainderMessage + water + ml + "\n" + beansRemainderMessage + beans + gram +
                "\n" + milkRemainderMessage + milk + ml + "\n" + sugarRemainderMessage + sugar + gram);

        System.out.println("Have a nice day\nBye)");


    }
}
