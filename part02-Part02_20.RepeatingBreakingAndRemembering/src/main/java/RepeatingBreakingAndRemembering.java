
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.next());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum += number;
            numbers++;
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        double average = (double) sum / numbers;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
