public class Circle extends Shape implements Colorable {

    private double radius;

    public Circle(){
        super();
    }
    public Circle(double radius,String color,boolean filled){

        super(color,filled);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }



    @Override
    public boolean equals(Object object){
        if(object instanceof Circle)return this.radius==((Circle)object).radius;
        else return false;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all the circle");
    }
}
