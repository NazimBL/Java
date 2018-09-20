import java.time.Instant;
import java.util.Date;

public abstract class Shape implements Colorable {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public Shape(){

        this.dateCreated=Date.from(Instant.now());
    }
    public Shape(String col,boolean fill){

        this.dateCreated=Date.from(Instant.now());
        this.filled=fill;
        this.color=col;
    }

    public String getColor() {
        return color;
    }



    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String ShapeInfo(){
        return "Shape Created on : "+this.dateCreated+
                "\n Color : "+this.color+
                 "\n Filled : "+this.filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}

