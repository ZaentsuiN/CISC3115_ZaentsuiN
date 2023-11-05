public class Rational extends Number implements Comparable<Rational> {

    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        long gcd = gcd(numerator, denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator() + this.denominator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator() - this.denominator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n = this.numerator * secondRational.getNumerator();
        long d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        long n = this.numerator * secondRational.getDenominator();
        long d = this.denominator * secondRational.numerator;
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        return (this.subtract((Rational) (other))).getNumerator() == 0;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override 
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        long d = this.subtract(o).getNumerator();
        if (d > 0) {
            return 1;
        } else if (d < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    private static long gcd(long n, long d) {
        while (d != 0) {
            long r = n % d;
            n = d;
            d = r;
        }
        return n;
    }
}
