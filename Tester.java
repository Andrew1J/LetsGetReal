public class Tester{
    public static void main(String[] args){
        //RealNumber class tests
        RealNumber a = new RealNumber(2.0);
        RealNumber b = new RealNumber(2.00000000001);
        System.out.println(a.equals(b));
        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
        System.out.println(a.divide(b).toString());
        System.out.println(a.subtract(b).toString());

        //RationalNumber class tests
        RationalNumber c = new RationalNumber(3,2);
        RationalNumber d = new RationalNumber(2,-2);
        RationalNumber e = new RationalNumber(6,0);
        System.out.println(c.getValue());
        System.out.println(d.getValue());
        System.out.println(e.getValue());
        System.out.println(c.getNumerator());
        System.out.println(d.getNumerator());
        System.out.println(e.getNumerator());
        System.out.println(c.getDenominator());
        System.out.println(d.getDenominator());
        System.out.println(e.getDenominator());
    }
}
