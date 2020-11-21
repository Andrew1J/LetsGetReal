public class RealNumber{
    private double value;

    public RealNumber(double v){
        value = v;
    }

    public double getValue(){
        return value;
    }

    public String toString(){
        return ""+getValue();
    }

    public boolean equals(RealNumber other){
        if(value==0||other.value==0){
            return value == 0 && other.value==0;
        }
        double c = value - other.value;
        return Math.abs(value-other.value) <= (0.00001*value);
    }

    public RealNumber add(RealNumber other){
        return new RealNumber(other.value+value);
    }

    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(RealNumber other){
        return new RealNumber(other.value*value);
    }

    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(RealNumber other){
        return null;
    }

    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(RealNumber other){
        return null;
    }
}
