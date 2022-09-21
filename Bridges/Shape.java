package Bridges;

public abstract  class Shape {

    //Composition of the color

    protected Color color;

    public Shape(Color c)
    {
        this.color =c;
    }


    abstract public void applyColor();


}
