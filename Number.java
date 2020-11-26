public abstract class Number{
    public abstract double getValue();

    /*return 0 when this Number equals the other RealNumber
    return a negative value when this Number is smaller than the other Number
    return a positive value when this Number is larger than the other Number
    */
    public int compareTo(Number other){
        if(getValue()==other.getValue())return 0;
        if(getValue()<other.getValue())return -1;
        if(getValue()>other.getValue())return 1;
    }

    public boolean equals(Number other){
        if(getValue()==0||other.getValue()==0){
            return getValue() == 0 && other.getValue() == 0;
        }
        return Math.abs(getValue()-other.getValue()) <= (0.00001*getValue());
    }
}
