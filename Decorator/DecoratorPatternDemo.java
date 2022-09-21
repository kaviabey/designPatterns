package Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        MyCalculator  cal =  new MyCalculator();
        cal.calculate(34,45);
        MultiplyCalDeco multiCal =  new MultiplyCalDeco(cal);
        multiCal.calculate(12,23);
    }
}
