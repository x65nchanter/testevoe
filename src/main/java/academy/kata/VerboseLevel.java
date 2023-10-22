package academy.kata;

public enum VerboseLevel {
    FULL, EXCEPTION, USER_MESSAGE;

    public boolean isPrintException() {
        return this == VerboseLevel.FULL || this == VerboseLevel.EXCEPTION;
    }

    public boolean isPrintMessage() {
        return this == VerboseLevel.FULL || this == VerboseLevel.USER_MESSAGE;
    }
}
