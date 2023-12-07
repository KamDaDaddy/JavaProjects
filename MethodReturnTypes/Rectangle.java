package MethodReturnTypes;

public class Rectangle {
    
    int height = 15;
    int width = 17;

    public void getResize(int w, int h)
    {
        width = w;
        height = h;
    }

    public int getArea()
    {
        return width * height;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }
}
