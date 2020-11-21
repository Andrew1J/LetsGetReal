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

    /**Calculate the GCD of two integers.
    *@param a the first integers
    *@param b the second integer
    *@return the value of the GCD
    */
    private static int gcd(int a, int b){
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        while(big%small!=0){
            big = small;
            small = big%small;
        }
        return small;
    }

    /**
    *Divide the numerator and denominator by the GCD
    *This must be used to maintain that all RationalNumbers are
    *reduced after construction.
    */
    private void reduce(){

    }
    /******************Operations Return a new RationalNumber!!!!****************/
    /**
    *Return a new RationalNumber that is the product of this and the other
    */
    public RationalNumber multiply(RationalNumber other){
        return null;
    }

    /**
    *Return a new RationalNumber that is the this divided by the other
    */
    public RationalNumber divide(RationalNumber other){
        return null;
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
