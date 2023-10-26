package academy.kata;

import java.util.Objects;

public class OutputEncoder {
    public static String encode(Object output) {
        Object o = Objects.requireNonNull(output);
        if (o instanceof RomanNumber number) {
            return RomanNumberEncoder.encode(number);
        } else if (o instanceof ArabicNumber number) {
            return ArabicNumberEncoder.encode(number);
        }
        throw new IllegalStateException("Unexpected value: " + output);
    }
}
