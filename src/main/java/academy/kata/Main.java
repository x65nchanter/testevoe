package academy.kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserFriendlyException.setVerboseLevel(VerboseLevel.FULL);

        if (scanner.hasNext()) {
            try {
                calc(scanner.nextLine());
            } catch (IllegalArgumentException | ArithmeticException e) {
                UserFriendlyException.print(e);
            }
        }

        scanner.close();
    }

    // Input format: arabic operator arabic | roam operator roam
    public static void calc(String input) {
        UserInput processedInput = UserInputProcessor.decode(input);
        Object arithmeticResult = ArithmeticProcessor.evaluate(processedInput.operation, processedInput.alpha, processedInput.beta);
        String output = OutputEncoder.encode(arithmeticResult);
        System.out.println(output);
    }
}

