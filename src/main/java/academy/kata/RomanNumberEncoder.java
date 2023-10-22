package academy.kata;

import java.util.Objects;

public class RomanNumberEncoder {
    public static String encode(RomanNumber number) {
        int value = Objects.requireNonNull(number).getValue();
        StringBuilder encoded = new StringBuilder();
        for (RomanDigit digit : RomanDigit.values()) {
            if (value < digit.divider) continue;
            int div = value / digit.divider;
            encoded.append(digit.name().repeat(div));
            value %= digit.divider;
        }
        return encoded.toString();
    }
}
