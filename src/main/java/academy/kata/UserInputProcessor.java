package academy.kata;

public class UserInputProcessor {

    public static UserInput decode(String input) {
        String[] tokens = InputTokenizer.tokenize(input);

        if (tokens.length != 3)
            throw new IllegalArgumentException("Wrong argument count");

        ArithmeticOperation operator = OperatorDecoder.decode(tokens[1]);
        Object argument1 = ArgumentDecoder.decode(tokens[0]);
        Object argument2 = ArgumentDecoder.decode(tokens[2]);

        return new UserInput(argument1, argument2, operator);
    }
}
