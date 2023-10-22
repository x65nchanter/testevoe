package academy.kata;

import java.util.Objects;

public class ArabicDecoder {

    public static ArabicNumber decode(String token) {
        int value = Integer.decode(Objects.requireNonNull(token));
        if (value > 10) throw new IllegalArgumentException("Argument can't be greater then 10");
        if (value < 1) throw new IllegalArgumentException("Argument can't be lesser then 1");
        return ArabicNumber.valueOf(value);
    }
}
