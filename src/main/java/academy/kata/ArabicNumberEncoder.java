package academy.kata;

import java.util.Objects;

public class ArabicNumberEncoder {
    public static String encode(ArabicNumber number) {
        return Integer.toString(Objects.requireNonNull(number).getValue());
    }
}
