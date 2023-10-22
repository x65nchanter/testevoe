package academy.kata;

public enum RomanDigit {
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    final int divider;

    RomanDigit(int divider) {
        this.divider = divider;
    }
}
