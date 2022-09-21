package Decorator;

public class MyCalculator implements  Calculator{

    public   void calculate(int x, int y)
    {
        add(x,y);
    }

    private void add(int x,int y)
    {
        System.out.println("\nResult of additio is "+ (x+y));
    }
}
