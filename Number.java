public abstract class Number{
    public abstract double getValue();

    public int compareTo(Number other){
        if(getValue()==other.getValue())return 0;
        if(getValue()<other.getValue())return -1;
        return 1;
    }

    public boolean equals(Number other){
        if(getValue()==0||other.getValue()==0){
            return getValue() == 0 && other.getValue() == 0;
        }
        return Math.abs(getValue()-other.getValue()) <= (0.00001*getValue());
    }
}
