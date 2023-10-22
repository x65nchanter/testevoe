package academy.kata;

import java.util.Objects;

public enum UserFriendlyMessage {
    EMPTY_MESSAGE(""),
    ARGUMENT_MESSAGE("""
            Correct input format is: arabic operator arabic | roam operator roam
            Where:
            \tarabic is 1 2 3 4 5 6 7 8 9 10
            \troam is I II III IV V VI VII VIII IX X
            \toperator is + - * /"""),
    ARITHMETIC_MESSAGE("""
            Arithmetic does not include a result for:
            \tdivide by zero
            \tnumbers less than 1 in the case of Roman""");

    private final String message;

    UserFriendlyMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static UserFriendlyMessage valueOf(Exception e) {
        return switch (Objects.requireNonNull(e)) {
            case IllegalArgumentException ignored -> UserFriendlyMessage.ARGUMENT_MESSAGE;
            case ArithmeticException ignored -> UserFriendlyMessage.ARITHMETIC_MESSAGE;
            default -> UserFriendlyMessage.EMPTY_MESSAGE;
        };
    }
}
