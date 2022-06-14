package Chapter2Ex;

import java.awt.*;

public class RectangleClass {

    private double length;
    private  double width;

    public RectangleClass() {
        this.length =1;
        this.width = 1;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
            //throw new IllegalArgumentException();
        }
    }
    public double getLength() {
        return length;
    }
    public  void setWidth(){
        if(width > 0 && width < 20.0) {

            this.width = width;
            }


            }

    public double getWidth() {
        return width;
    }
    public double rectanglePerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;

    }
    public  double rectangleArea() {
        double area = length*width;
        return area;
    }
}
