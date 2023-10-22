package academy.kata;

import java.util.Objects;
import java.util.regex.Pattern;

public class InputTokenizer {
    public static Pattern OPERATOR_CHARACTER_SPLITTER = Pattern.compile("[+\\-/*]");
    public static int ARGUMENT_COUNT_LIMIT = 2;

    public static String[] tokenize(String input) {
        String clearedInput = clear(input);
        return OPERATOR_CHARACTER_SPLITTER.splitWithDelimiters(clearedInput, ARGUMENT_COUNT_LIMIT);
    }

    public static String clear(String input) {
        return Objects.requireNonNull(input).replaceAll("[ \t]", "");
    }
}
