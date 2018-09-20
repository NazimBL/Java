package com.company;

public class Test1  {

    public static void test1(){
        Buffer buf1 = new Buffer("BUF1");
        Buffer buf2 = new Buffer("BUF2");
        NotGate not1 = new NotGate("NOT1");
        NotGate not2 = new NotGate("NOT2");
        AndGate and1 = new AndGate("AND1");
        AndGate and2 = new AndGate("AND2");
        OrGate or1 = new OrGate("OR1");
        OrGate or2 = new OrGate("OR2");
        XorGate xor1 = new XorGate("XOR1");
// Next make the connections
        buf1.connectTo(and1,1);
        buf1.connectTo(and2,1);
        buf1.connectTo(or1,1);
        buf1.connectTo(or2,1);
        buf1.connectTo(xor1,1);
        buf2.connectTo(and1,2);
        buf2.connectTo(and2,2);
        buf2.connectTo(or1,2);
        buf2.connectTo(or2,2);
        buf2.connectTo(xor1,2);
        and2.connectTo(not1);
        or2.connectTo(not2);
// Finally run the simulation
        boolean[] x1 = {false, true};
        boolean[] x2 = {false, true};
        System.out.println("X1\tX2\tY1\tY2\tY3\tY4\tY5");
        for (int i=0; i < x1.length; ++i)
            for (int j=0; j < x2.length; ++j)
            {
// set the inputs
                buf1.setInValue(x1[i]);
                buf2.setInValue(x2[j]);
// display the outputs
                System.out.print(buf1.getOutValue() + "\t" + buf2.getOutValue() + "\t");
                System.out.print(and1.getOutValue ()+ "\t" + or1.getOutValue() + "\t");
                System.out.print(xor1.getOutValue() + "\t");
                System.out.print(not1.getOutValue() + "\t" + not2.getOutValue() + "\n");
            }
    }
    public static void test2(){
        // Create the gates
        Buffer buf1 = new Buffer("BUF1");
        NotGate not1 = new NotGate("NOT1");
        AndGate and1 = new AndGate("AND1");
        AndGate and2 = new AndGate("AND2");
        OrGate or1 = new OrGate("OR1");
// Connect the circuit
        buf1.connectTo(not1);
        buf1.connectTo(and2, 1);
        not1.connectTo(and1, 2);
        and1.connectTo(or1, 1);
        and2.connectTo(or1, 2);
// Run the simulation
        boolean[] c = {false, true};
        boolean[] i0 = {false, true};
        boolean[] i1 = {false, true};
        for (int i = 0; i < c.length; ++i)
        {
            buf1.setInValue(c[i]);
            System.out.println("C = " + buf1.getInValue());
            System.out.println("I0\tI1\tQ");
            for (int j = 0; j < i0.length; ++j)
                for (int k = 0; k < i1.length; ++k)
                {
                    and1.setIn1Value(i0[j]);
                    and2.setIn2Value(i1[k]);
                    System.out.print(and1.getIn1Value() + "\t");
                    System.out.print(and2.getIn2Value( )+ "\t");
                    System.out.println(or1.getOutValue());
                }
        }
    }
    public static void Half_Adder_Test(){

        HalfAdder hd=new HalfAdder("HA");
        hd.setIn1Value(true);
        hd.setIn2Value(true);
        System.out.println(hd.getOut().isTerminalValue());
        System.out.println(hd.getOut2().isTerminalValue());

    }
    public static void Full_Adder_Test(){
        FullAdder fullAdder=new FullAdder("FA");
        fullAdder.in1.setTerminalValue(true);
        fullAdder.in2.setTerminalValue(false);
        fullAdder.Cin.setTerminalValue(false);

        System.out.println(fullAdder.getOut().isTerminalValue());
        System.out.println(fullAdder.getOut2().isTerminalValue());

    }
}
