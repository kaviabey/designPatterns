package Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements  Shape{

    private List<Shape> shapes   =  new ArrayList<Shape>();

    @Override
    public  void  draw(String  fillColor)
    {

        for(Shape sh:shapes)
            sh.draw(fillColor);

    }
    public   void add(Shape e)
    {
        this.shapes.add(e);
    }


    public void remove(Shape e)
    {
        this.shapes.remove(e);
    }


    public void clear(){
        System.out.println("Clearing all the shapes from drawing");

       this.shapes.clear();
     }
}
