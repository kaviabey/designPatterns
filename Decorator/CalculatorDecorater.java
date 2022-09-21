package Decorator;

public abstract class CalculatorDecorater implements  Calculator{
    protected  Calculator calc;
    protected CalculatorDecorater(Calculator id)
    {

        this.calc = id;

    }
}
