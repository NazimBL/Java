public class Rectangular extends  Shape implements Cloneable,Colorable {
    private double length,width;

    public Rectangular(){
        super();
    }

    public Rectangular(String color, boolean fill, double length, double width){

        super(color,fill);
        this.length=length;
        this.width=width;

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getCircumference(){

        return (this.length+this.width)*2;
    }
    public double getArea(){
        return (this.length*this.width);
    }

    @Override
    public double getPerimeter() {
        return this.length+this.width;
    }

    public String ShapeInfo(){
        return super.ShapeInfo()+
                "\n Length "+length+
                "\n Width "+width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all Rectangle sides");
    }
}
