package com.company;

public class Main {


    public static void main(String[] args) {

//      Buffer buffer=new Buffer("7074");
//      buffer.setInValue(true);
//      System.out.println(buffer.getOutValue());

        //inputs
        boolean[] a={true,true,false,false};
        boolean[] b={false,false,false,true};
        boolean Cin=false;
        FullAdder[] fullAdders=new FullAdder[4];
        //outputs
        boolean[] Sum=new boolean[4];
        boolean Cout;
        for(int i=0;i<4;i++){
            fullAdders[i]=new FullAdder("FA"+i);
            fullAdders[i].setIn1Value(a[i]);
            fullAdders[i].setIn2Value(b[i]);
            if(i==0)fullAdders[i].setCinValue(Cin);
            else fullAdders[i].setCinValue(fullAdders[i-1].getOut2().isTerminalValue());
            Sum[i]=fullAdders[i].getOut().isTerminalValue();
        }
        Cout=fullAdders[3].getOut2().isTerminalValue();
        for(int i=0;i<4;i++){
            System.out.println("S"+i+" "+Sum[i]);
        }
        System.out.println("Cout "+Cout);

    }
    }

