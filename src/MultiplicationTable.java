public class MultiplicationTable {
    public static void main(String[] args) {
        for (int counter = 1; counter < 10; counter++) {
            for (int i = 1; i < 10; i++){
                System.out.println(counter + " * " + i + " = " + counter * i);
            }
            System.out.println(" ");
        }
    }
}
