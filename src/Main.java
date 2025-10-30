//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int lowerLimit = 0;
        int upperLimit = 100;

        System.out.print("Hello and welcome! \n");

        for (int i = 1; i <= upperLimit; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 100; i >= lowerLimit; i--) {
            System.out.println("i = " + i);
        }
    }
}