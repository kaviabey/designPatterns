package Composite;

public class Circle  implements  Shape{

    @Override
    public void  draw(String fullColor)
    {

        System.out.println("Drawing a circle with color"+fullColor);
    }
}

