package academy.kata;

import java.util.Objects;

public class ArabicArithmetic {
    public static ArabicNumber evaluate(ArithmeticOperation operation, ArabicNumber alpha, ArabicNumber beta) {
        ArithmeticOperation _operation = Objects.requireNonNull(operation);
        int alphaValue =  Objects.requireNonNull(alpha).getValue();
        int betaValue = Objects.requireNonNull(beta).getValue();

        return switch (_operation) {
            case ADD -> ArabicNumber.valueOf(alphaValue + betaValue);
            case SUBTRACT -> ArabicNumber.valueOf(alphaValue - betaValue);
            case MULTIPLY -> ArabicNumber.valueOf(alphaValue * betaValue);
            case DIVIDE -> ArabicNumber.valueOf(alphaValue / betaValue);
        };
    }
}
