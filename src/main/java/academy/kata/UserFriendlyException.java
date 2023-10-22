package academy.kata;

import java.util.Objects;

public class UserFriendlyException {
    public static VerboseLevel verboseLevel = VerboseLevel.FULL;

    public static void setVerboseLevel(VerboseLevel verboseLevel) {
        UserFriendlyException.verboseLevel = verboseLevel;
    }

    public static void print(Exception e) {
        Exception exception = Objects.requireNonNull(e);
        if (verboseLevel.isPrintException())
            exception.printStackTrace(System.err);

        if (verboseLevel.isPrintMessage())
            System.err.println(UserFriendlyMessage.valueOf(exception).getMessage());
    }
}

