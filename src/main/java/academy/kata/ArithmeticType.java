package academy.kata;

import java.util.Objects;

public enum ArithmeticType {
    ARABIC, ROAM;

    public static ArithmeticType getArithmeticType(Object argument) {
        return switch (Objects.requireNonNull(argument)) {
            case ArabicNumber ignored -> ArithmeticType.ARABIC;
            case RomanNumber ignored -> ArithmeticType.ROAM;
            default -> throw new IllegalArgumentException("Unknown arithmetic type of argument: " + argument);
        };
    }
}
