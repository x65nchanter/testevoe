package academy.kata;

import java.util.Objects;

public class OperatorDecoder {

    public static ArithmeticOperation decode(String token) {
        return switch (Objects.requireNonNull(token)) {
            case "+" -> ArithmeticOperation.ADD;
            case "-" -> ArithmeticOperation.SUBTRACT;
            case "*" -> ArithmeticOperation.MULTIPLY;
            case "/" -> ArithmeticOperation.DIVIDE;
            default -> throw new IllegalStateException("Unexpected value: " + token);
        };
    }
}
