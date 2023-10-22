package academy.kata;

import java.util.Objects;

public class ArgumentDecoder {

    public static Object decode(String token) {
        if (Objects.requireNonNull(token).isEmpty()) throw new IllegalArgumentException("Argument can't be empty");
        char first = token.charAt(0);
        if (Character.isDigit(first)) {
            return ArabicDecoder.decode(token);
        } else if (Character.isLetter(first)) {
            return RomanDecoder.decode(token);
        } else {
            throw new IllegalArgumentException("Unknown first letter of: " + token);
        }
    }
}
