package se.gritacademy;

public class Mathematics {

    public long minLong(long val, long val2){
        return Math.min(val, val2);
    }

    public float minFloat(float val, float val2){
        return Math.min(val,val2);
    }
    public int minInteger(int val, int val2){
        return Math.min(val,val2);
    }
    public double minDouble(double val, double val2){
        return Math.min(val,val2);
    }
    public double powerOff(double val, double val2){
        return Math.pow(val,val2);
    }
    public int valueIntegerPlusOne(int val){
        return val + 1;
    }
    public long valueLongPlusOne(long val){
        return val + 1L;
    }
    public int valueIntegerMinusOne(int val){
        return val - 1;
    }
    public long valueLongMinusOne(long val){
        return val - 1L;
    }
    public double squaredOff(double val) {
        return Math.sqrt(val);
    }
    public double cubicValueOff(double val){
        return Math.cbrt(val);
    }
    public double randomValue(double val){
        return Math.random() * val;
    }




    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        System.out.println(math.cubicValueOff(120.00));
    }
}
