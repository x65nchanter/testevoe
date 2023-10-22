package academy.kata;

public class RomanNumber {
    public int value;

    public RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static RomanNumber valueOf(int value) {
        return new RomanNumber(value);
    }
}
