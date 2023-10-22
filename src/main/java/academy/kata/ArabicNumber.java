package academy.kata;

public class ArabicNumber {
    public int value;

    public ArabicNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ArabicNumber valueOf(int value) {
        return new ArabicNumber(value);
    }
}
