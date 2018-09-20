public class Triangle  extends Shape implements Colorable{

    private double l1,l2,l3;

    public Triangle(){
        super();
    }

    public Triangle(double l1,double l2,double l3,boolean filled,String color){

        super(color,filled);
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;

    }

    @Override
    public double getArea() {
        double p=(this.l1+this.l2+this.l3)/2;
        double area=Math.sqrt(p*(p-this.l1)*(p-this.l2)*(p-this.l3));

        return area;
    }

    @Override
    public String ShapeInfo() {
        return super.ShapeInfo();
    }

    @Override
    public double getPerimeter() {
        return(this.l1+this.l2+this.l3);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all three sides");
    }
}
