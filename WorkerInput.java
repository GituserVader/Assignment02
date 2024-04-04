import java.util.Scanner; // To import scanner function
// Class to provide methods for handling user input
public class WorkerInput {
    Scanner keyboard = new Scanner(System.in);
    
    public int inputInteger() {
        int value = keyboard.nextInt();
        keyboard.nextLine();
        return value;
    }
    
    public int inputInteger(String message) {
        System.out.println(message);
        int value = inputInteger();
        return value;
    }
    
    public double inputDouble() {
        double value = keyboard.nextDouble();
        keyboard.nextLine();
        return value;    
    }
    
    public double inputDouble(String message) {
        System.out.println(message);
        double value = inputDouble();
        return value;
    }
}