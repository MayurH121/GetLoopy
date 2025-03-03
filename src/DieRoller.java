import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuePlaying = true;

        while (continuePlaying) {
            System.out.println("Roll Die1 Die2 Die3 Sum");
            System.out.println("-----------------------");

            for (int rollCount = 1; ; rollCount++) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%4d %4d %4d %4d %4d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    System.out.print("Do you want to play again? (y/n): ");
                    String input = scanner.next();

                    if (input.equalsIgnoreCase("n")) {
                        continuePlaying = false;
                    }
                    break;
                }
            }
        }
    }
}
