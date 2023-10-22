package academy.kata;

import java.util.Objects;

public class RomanDecoder {

    public static RomanNumber decode(String token) {
        String upper = Objects.requireNonNull(token).toUpperCase();
        RomanDigit[] digits = RomanDigit.values();
        int value = 0;
        int offset = 0;
        for (int digitIndex = 0; offset < upper.length() && digitIndex < digits.length;) {
            RomanDigit digit = digits[digitIndex];
            String digitName = digit.name();
            if (upper.startsWith(digitName, offset)) {
                value += digit.divider;
                offset += digitName.length();
            } else {
                digitIndex++;
            }
        }

        if (offset < token.length()) throw new IllegalArgumentException("Argument is not a Roman number");

        return RomanNumber.valueOf(value);
    }
}
