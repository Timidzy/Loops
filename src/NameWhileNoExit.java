import java.util.Scanner;

public class NameWhileNoExit {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hello, enter your name");
        while (true){
            String name = myScan.nextLine();
            if (name.equals("exit")){
                break;
            }else System.out.println("Your name is " + name);
        }

    }
}
