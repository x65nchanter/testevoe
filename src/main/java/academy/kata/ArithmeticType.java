package academy.kata;

import java.util.Objects;

public enum ArithmeticType {
    ARABIC, ROAM;

    public static ArithmeticType getArithmeticType(Object argument) {
        Object o = Objects.requireNonNull(argument);
        if (o instanceof ArabicNumber) {
            return ArithmeticType.ARABIC;
        } else if (o instanceof RomanNumber) {
            return ArithmeticType.ROAM;
        }
        throw new IllegalArgumentException("Unknown arithmetic type of argument: " + argument);
    }
}
