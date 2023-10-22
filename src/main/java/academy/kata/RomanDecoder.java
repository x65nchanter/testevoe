package academy.kata;

import java.util.Objects;

public class RomanDecoder {

    public static RomanNumber decode(String token) {
        String upper = Objects.requireNonNull(token).toUpperCase();
        RomanDigit[] digits = RomanDigit.values();
        int value = 0;
        for (int offset = 0, digitIndex = 0; offset < upper.length() && digitIndex < digits.length;) {
            RomanDigit digit = digits[digitIndex];
            String digitName = digit.name();
            if (upper.startsWith(digitName, offset)) {
                value += digit.divider;
                offset += digitName.length();
            } else {
                digitIndex++;
            }
        }

        return RomanNumber.valueOf(value);
    }
}
