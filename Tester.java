public class Tester{
    public static void main(String[] args){
        RealNumber a = new RealNumber(2.0);
        RealNumber b = new RealNumber(2.00000000001);
        System.out.println(a.equals(b));
        System.out.println(a.add(b).toString());
    }
}
