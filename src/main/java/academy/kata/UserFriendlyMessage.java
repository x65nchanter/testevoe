package academy.kata;

import java.util.Objects;

public enum UserFriendlyMessage {
    EMPTY_MESSAGE(""),
    ARGUMENT_MESSAGE("""
            Correct input format is: arabic operator arabic | roman operator roman
            Where:
            \tarabic is 1 2 3 4 5 6 7 8 9 10
            \troman is I II III IV V VI VII VIII IX X
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
        Exception exception = Objects.requireNonNull(e);
        if (exception instanceof IllegalArgumentException) {
            return UserFriendlyMessage.ARGUMENT_MESSAGE;
        } else if (exception instanceof ArithmeticException) {
            return UserFriendlyMessage.ARITHMETIC_MESSAGE;
        }
        return UserFriendlyMessage.EMPTY_MESSAGE;
    }
}
