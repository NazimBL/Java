
public class Fan {

     public static final int SLOW=1;
     public static final int MEDIUM=2;
     public static final int FAST=3;

     private int speed;
     private boolean on;
     private double radius;
     private String color;

     public Fan(){
         this.speed=SLOW;
         this.on=false;
         this.radius=5;
         this.color="Blue";
     }

     public Fan(int s,boolean on,double r,String color){
         this.speed=s;
         this.on=on;
         this.radius=r;
         this.color=color;
     }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString() {

        if (this.on) {
            return "Fan is On with speed : " + this.speed +
                    "\nColor " + this.color +
                    "\nFan raidus : " + this.radius;
        } else {
            return "Fan is off , Color : "+this.color+
                    "\nradius "+this.radius;
        }

    }
}
