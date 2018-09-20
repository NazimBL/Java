public class Square extends Shape implements Colorable {

    double side;
    public Square(){super();}
    public Square(double side,String color,boolean filled){
        super(color,filled);
        this.side=side;

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }
}

