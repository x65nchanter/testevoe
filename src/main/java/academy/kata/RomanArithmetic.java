package academy.kata;

import java.util.Objects;

public class RomanArithmetic {
    public static RomanNumber evaluate(ArithmeticOperation operation, RomanNumber alpha, RomanNumber beta) {
        ArithmeticOperation _operation = Objects.requireNonNull(operation);
        int alphaValue =  Objects.requireNonNull(alpha).getValue();
        int betaValue = Objects.requireNonNull(beta).getValue();
        if (_operation == ArithmeticOperation.SUBTRACT && alphaValue - betaValue < 1)
            throw new ArithmeticException("Roam arithmetic don't include negative number and zero");

        return switch (_operation) {
            case ADD -> RomanNumber.valueOf(alphaValue + betaValue);
            case SUBTRACT -> RomanNumber.valueOf(alphaValue - betaValue);
            case MULTIPLY -> RomanNumber.valueOf(alphaValue * betaValue);
            case DIVIDE -> RomanNumber.valueOf(alphaValue / betaValue);
        };
    }
}
