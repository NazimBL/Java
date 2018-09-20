
public class QuadraticEquations {
    private double a,b,c;

    public QuadraticEquations(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getC() {
        return c;
    }

    public double getB() {

        return b;
    }

    public double getA() {

        return a;
    }
    public double getDiscriminant(){

        return (this.b*this.b)-4*this.a*this.c;
    }
    public double getRoot1(){
        double delta=this.getDiscriminant();
        if(delta>=0)return (-b-Math.sqrt(delta))/2;
        else return 0;
    }
    public double getRoot2(){

        double delta=this.getDiscriminant();
        if(delta>=0)return (-b+Math.sqrt(delta))/2;
        else return 0;
    }

}
