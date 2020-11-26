public class RationalNumber extends Number{
    private int numerator, denominator;

    public RationalNumber(int nume, int deno){
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
        other.reduce();
        return numerator == other.getNumerator() && denominator == other.getDenominator();
    }

    public String toString(){
        if(denominator==1)return ""+numerator;
        if(numerator==0)return ""+0;
        return numerator+"/"+denominator;
    }

    private static int gcd(int a, int b){
        if(a==0)return b;
        if(b==0)return a;
        int big = Math.max(Math.abs(a),Math.abs(b));
        int small = Math.min(Math.abs(a),Math.abs(b));
        while((big%small)!=0){
            small = big%small;
            big = small;
        }
        return small;
    }

    private void reduce(){
        int divide = gcd(numerator,denominator);
        numerator = (numerator / divide);
        denominator = (denominator / divide);
    }

    public RationalNumber multiply(RationalNumber other){
        return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    }

    public RationalNumber divide(RationalNumber other){
        return multiply(other.reciprocal());
    }

    public RationalNumber add(RationalNumber other){
        return new RationalNumber((numerator * other.getDenominator()) + (other.getNumerator() * denominator),
        denominator * other.getDenominator());
    }

    public RationalNumber subtract(RationalNumber other){
        return add(other.multiply(new RationalNumber(-1,1)));
    }
}
