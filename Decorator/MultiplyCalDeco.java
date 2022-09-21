package Decorator;

public class MultiplyCalDeco  extends  CalculatorDecorater{


    public MultiplyCalDeco(Calculator i){
        super(i);
    }
    public void multiply(int x,int y){
        System.out.println("The product of "+x +" and y is: "+x*y);
    };
    public void calculate(int x,int  y)
    {
        calc.calculate(x,y);
        multiply(x,y);

    }


}
