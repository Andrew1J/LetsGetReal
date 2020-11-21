public class RationalNumber extends RealNumber{
    private int numerator, denominator;

    public RationalNumber(int nume, int deno){
        super(0.0);//this value is ignored!
        if(deno == 0){
            nume = 0;
            deno = 1;
        }
        if(deno<0){
            nume *= -1;
            deno *= -1;
        }
        numerator = nume;
        denominator = deno;
        reduce();
    }

    public double getValue(){
        return (double) numerator/denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public RationalNumber reciprocal(){
        return new RationalNumber(denominator,numerator);
    }

    public boolean equals(RationalNumber other){
        return numerator == other.getNumerator() && denominator == other.getDenominator();
    }

    public String toString(){
        return numerator+"/"+denominator;
    }

    private static int gcd(int a, int b){
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        while(big%small!=0){
            big = small;
            small = big%small;
        }
        return small;
    }

    private void reduce(){
        numerator = numerator / gcd(numerator,denominator);
        denominator = denominator / gcd(numerator,denominator);
    }

    public RationalNumber multiply(RationalNumber other){
        return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    }

    public RationalNumber divide(RationalNumber other){
        return multiply(other.reciprocal());
    }

    /**
    *Return a new RationalNumber that is the sum of this and the other
    */
    public RationalNumber add(RationalNumber other){
        return null;
    }
    /**
    *Return a new RationalNumber that this minus the other
    */
    public RationalNumber subtract(RationalNumber other){
        return null;
    }
}
