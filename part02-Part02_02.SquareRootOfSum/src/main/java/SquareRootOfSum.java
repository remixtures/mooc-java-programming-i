
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.valueOf(scanner.nextLine());
        int numberTwo = Integer.valueOf(scanner.nextLine());
        int sum = numberOne + numberTwo;
        double result = Math.sqrt(sum);
        System.out.println(result);
    }
}
