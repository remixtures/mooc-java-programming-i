
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0; 
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.next());
            
            if (value == 0) {
                break;
            }
            
            sum += value;
            numbers++;
        }
        
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
        

    }
}
