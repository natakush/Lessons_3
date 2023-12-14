package org.five;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public boolean equals(Object o) {
        Fraction that = (Fraction) o;
        return (float)this.numerator/this.denominator == (float)that.numerator/that.denominator;
    }

}
