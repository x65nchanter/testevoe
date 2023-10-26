package academy.kata;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputTokenizer {
    public static Pattern INPUT_PATTERN = Pattern.compile("[+\\-/*]");
    public static int ARGUMENT_COUNT_LIMIT = 2;

    public static String[] tokenize(String input) {
        String clearedInput = clear(input);
        return splitWithDelimiter(INPUT_PATTERN, clearedInput, ARGUMENT_COUNT_LIMIT);
    }

    public static String[] splitWithDelimiter(Pattern pattern, String clearedInput, int limit) {
        int tokenCount = limit * 2 - 1;
        String[] tokens = new String[tokenCount];
        int tokenIndex = 0, endAt = 0;
        Matcher matcher = pattern.matcher(clearedInput);
        while (matcher.find() && tokenIndex < tokenCount - 1) {
            tokens[tokenIndex++] = clearedInput.substring(endAt, matcher.start());
            endAt = matcher.end();
            tokens[tokenIndex++] = clearedInput.substring(matcher.start(), endAt);
        }
        tokens[tokenIndex] = clearedInput.substring(endAt);
        return tokens;
    }

    public static String clear(String input) {
        return Objects.requireNonNull(input).replaceAll("[ \t]", "");
    }
}
