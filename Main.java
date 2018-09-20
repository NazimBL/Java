import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Date date=new Date(244);
        m1(date);
        Dela3 d=new Dela3();
        System.out.println(d.toString());


    }

    void lab6(){
        System.out.println("1st side of the triangle : ");
        double l1=new Scanner(System.in).nextDouble();
        System.out.println("2nd side of the triangle : ");
        double l2=new Scanner(System.in).nextDouble();
        System.out.println("3rd side of the triangle : ");
        double l3=new Scanner(System.in).nextDouble();
        System.out.println("Is the triangle filled ? ");
        boolean fill=new Scanner(System.in).nextBoolean();
        System.out.println("What's the triangle color ? ");
        String color=new Scanner(System.in).nextLine();
        Triangle triangle=new Triangle(l1,l2,l3,fill,color);
        System.out.println(" Color: "+triangle.getColor());
        System.out.println(" Filled : "+triangle.isFilled());
        System.out.println(" Area : "+triangle.getArea());
        System.out.println(" Perimeter : "+triangle.getPerimeter());

    }
    void lab7(){

        Shape shapes[]={new Circle(4,"Red",true),
                new Rectangular("Red",true,4,2),
                new Triangle(3,2,4,false,"Green"),
                new Square(4,"Violet",false)};


        for(int i=0;i<4;i++) shapes[i].howToColor();
    }

    public void accountHomeWork(){

        Account account=new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Acount Balance "+account.getBalance());
        System.out.println("Monthly Interest "+account.getMonthyInterest());
        System.out.println("Date Created "+account.getDateCreated());
    }

    public static int devideByZero(int n) throws Exception{

        return n/0;
    }

    public static void m1(Date date){
        date.setTime(121212);
       // date=new Date(12464);
    }



    private static int getNumber(char uppercaseLetter) {
        if (Character.isDigit(uppercaseLetter)) {
            return Integer.parseInt(String.valueOf(uppercaseLetter));
        }
        return Integer.parseInt(
                String.valueOf(uppercaseLetter)
                        .replaceAll("[ABC]", "2")
                        .replaceAll("[DEF]", "3")
                        .replaceAll("[GHI]", "4")
                        .replaceAll("[JKL]", "5")
                        .replaceAll("[MNO]", "6")
                        .replaceAll("[PQRS]", "7")
                        .replaceAll("[TUV]", "8")
                        .replaceAll("[WXYZ]", "9")
        );
    }

    public static void showPascal(int[][] raggedArray){

        for(int i=1;i<raggedArray.length;i++){
            for (int j=0;j<raggedArray[i-1].length;j++)System.out.print(raggedArray[i][j]+" ");
            System.out.print("\n");
        }
    }
    public static int[][] pascalTriangle(int nRows){
        int[][] pascal=new int[nRows][];
        //declare our ragged array and initialize first entry to ones
        for(int i=0;i<nRows;i++){
            pascal[i]=new int[i+1];
            pascal[i][0]=1;
        }

        pascal[1][1]=1;
        for(int i=2;i<nRows;i++){

            for (int j=1;j<pascal[i-1].length; j++) {
                if(j==pascal[i-1].length-1)  pascal[i][j]=pascal[i-1][j-1];
                else pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
            }
        }

        return  pascal;
    }

    public static void elapsedTest(){
        StopWatch chrono=new StopWatch();
        System.out.println("Started first chrono : "+chrono.getStartTime());
        int[] array=new int[100000];
        for(int i=0;i<100000;i++)array[i]=1;
        sortArray(array);
        chrono.stop();
        System.out.println("first chrono stoped : "+chrono.getEndTime());
        System.out.println("Elapsed time for bubble sort "+chrono.getElapsedTime());

        System.out.println("Started 2d chrono : "+chrono.getStartTime());
        chrono.start();
        for(int i=0;i<100000;i++){
            int k=i;
            int min=0;
            for(int j=0;j<100000-2;j++){
                if(array[k]<array[j]){
                    k=j;
                    min=array[j];
                    array[j]=array[j+1];
                    array[j+1]=min;
                }
            }
        }
        chrono.stop();
        System.out.println("second chrono stoped : "+chrono.getEndTime());
        System.out.println("Elapsed time for selective sort "+chrono.getElapsedTime());
    }
    public static void sortArray(int[] array){
        int min=0;
        for(int i=0;i<array.length;i++) {

            for (int j = 0; j < array.length-2; j++) {

                if (array[j] >array[j+1]) {
                    min=array[j];
                    array[j]=array[j+1];
                    array[j+1]=min;
                }
            }
        }
    }
}
