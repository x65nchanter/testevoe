package academy.kata;

import java.util.Objects;

public class ArithmeticProcessor {
    public static Object evaluate(ArithmeticOperation operation, Object alpha, Object beta) {
        ArithmeticType arithmeticType = concatenateTypes(alpha, beta);
        return evaluate(arithmeticType, operation, alpha, beta);
    }

    public static Object evaluate(ArithmeticType arithmeticType, ArithmeticOperation operation, Object alpha, Object beta) {
        return switch (Objects.requireNonNull(arithmeticType)) {
            case ArithmeticType.ARABIC -> ArabicArithmetic.evaluate(operation, (ArabicNumber) alpha, (ArabicNumber) beta);
            case ArithmeticType.ROAM -> RomanArithmetic.evaluate(operation, (RomanNumber) alpha, (RomanNumber) beta);
        };
    }

    public static ArithmeticType concatenateTypes(Object alpha, Object beta) {
        ArithmeticType alphaType = ArithmeticType.getArithmeticType(alpha);
        ArithmeticType betaType = ArithmeticType.getArithmeticType(beta);
        if (alphaType == betaType) {
            return alphaType;
        } else {
            throw new IllegalArgumentException("Inconsistent arithmetic types of first and second argument");
        }
    }
}
