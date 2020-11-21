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

    public RealNumber multiply(RealNumber other){
        return new RealNumber(other.value*value);
    }

    public RealNumber divide(RealNumber other){
        return new RealNumber(value/other.value);
    }

    public RealNumber subtract(RealNumber other){
        return new RealNumber(value-other.value);
    }
}
