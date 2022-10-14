public class Fraction {
    int top, bottom;

    Fraction(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction(40, 80);
        Fraction fraction2 = new Fraction(10, 80);
        fraction2.addition(fraction);
        fraction2.multiply(fraction);
    }

    public Fraction addition(Fraction fraction) {
        int firstFractionTop = this.top;
        int firstFractionBottom = this.bottom;
        int secondFractionTop = fraction.top;
        int secondFractionBottom = fraction.bottom;
        int newFractionTop, newFractionBottom;

        if (firstFractionBottom == secondFractionBottom) {
            newFractionTop = firstFractionTop + secondFractionTop;
            newFractionBottom = secondFractionBottom;
        } else {
            newFractionTop = secondFractionBottom * firstFractionTop + firstFractionBottom * secondFractionTop;
            newFractionBottom = secondFractionBottom * firstFractionBottom;
        }

        System.out.println(newFractionTop + "/" + newFractionBottom);
        return new Fraction(newFractionTop, newFractionBottom);
    }

    public Fraction multiply(Fraction fraction) {
        int firstFractionTop = this.top;
        int firstFractionBottom = this.bottom;
        int secondFractionTop = fraction.top;
        int secondFractionBottom = fraction.bottom;
        System.out.println(firstFractionTop * secondFractionTop + "/" + firstFractionBottom * secondFractionBottom);
        return new Fraction(firstFractionTop * secondFractionTop, firstFractionBottom * secondFractionBottom);
    }
}