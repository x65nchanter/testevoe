package academy.kata;

import java.util.Objects;

public class OutputEncoder {
    public static String encode(Object output) {
        return switch (Objects.requireNonNull(output)) {
            case RomanNumber number -> RomanNumberEncoder.encode(number);
            case ArabicNumber number -> ArabicNumberEncoder.encode(number);
            default -> throw new IllegalStateException("Unexpected value: " + output);
        };
    }
}
