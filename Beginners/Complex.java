import java.util.Scanner;

public class Complex {
    private double real,img;

    public Complex(double r,double i){
        this.real=r;
        this.img=i;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double getReal() {

        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void add(Complex b) {
        real += b.getReal();
        img += b.getImg();
    }
    // subtract a complex number and save the result in current number.
     public void subtract(Complex b)
     {
         real -= b.getReal();
     img -= b.getImg();
     }
    //divide by complex number and save the result in current object.
    public void multiply(Complex b) {
        double tempReal = real * b.real - img * b.img; img = real * b.img + img * b.real;
        real = tempReal;
    }
    public void devide(Complex b) {
        double magnitude = getMagnitude() / b.getMagnitude();
        double phase = getPhaseRad() - b.getPhaseRad();
        real = magnitude * Math.cos(phase); img = magnitude * Math.sin(phase);
    }
    //get the magnitude of this complex number
     public double getMagnitude() { return Math.sqrt(real * real + img * img); }
     //get the phase of this complex number in radians
     public double getPhaseRad() { return Math.atan2(img, real); }
     //get the phase of this complex number in degrees
     public double getPhaseDegrees() { return Math.atan2(img, real) / Math.PI * 180.0; }
    @Override
    public String toString() {
        if (real == 0 && img == 0) { return "0"; }
        else if (real == 0) { return img + " j"; }
        else if (img == 0) { return String.valueOf(real); }
        return real + " + j " + img;
    }

    public static void complexTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        Complex a = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter the second complex number: ");
        Complex b = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter One Operation\n" + "*****************************");
        System.out.println("1. Addition"); System.out.println("2. Subtraction");
        System.out.println("3. Multiplication"); System.out.println("4. Division");
        System.out.println("5. Magnitude and phase");
        System.out.print("Yout choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                a.add(b);
                System.out.println(a);
                break;
            case 2:
                a.subtract(b);
                System.out.println(a);
                break;
            case 3:
                a.multiply(b);
                System.out.println(a);
                break;
            case 4:
                a.devide(b);
                System.out.println(a);
                break;
            case 5:
                System.out.println("a = "+a.getMagnitude()+" | "+ a.getPhaseDegrees());
                System.out.println("b = "+b.getMagnitude()+" | "+ b.getPhaseDegrees());
                break;
        }
    }

}
