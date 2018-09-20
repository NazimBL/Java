package com.company;

public class FullAdder extends HalfAdder{

    GateTerminal out2,Cin;

    public FullAdder(String ref) {
        super(ref);
        in1=new GateTerminal(this,GateTerminal.INPUT,"IN1");
        in2=new GateTerminal(this,GateTerminal.INPUT,"IN2");
        Cin=new GateTerminal(this,GateTerminal.INPUT,"Cin");

        out=new GateTerminal(this,GateTerminal.OUTPUT,"S");
        out2=new GateTerminal(this,GateTerminal.OUTPUT,"C");
    }

    public void setCin(GateTerminal cin) {
        Cin = cin;
    }
    public void setCinValue(boolean val){
        this.Cin.setTerminalValue(val);
    }

    @Override
    void evaluate() {
        HalfAdder halfAdder1=new HalfAdder("HA1");
        halfAdder1.setIn1Value(in1.isTerminalValue());
        halfAdder1.setIn2Value(in2.isTerminalValue());

        HalfAdder halfAdder2=new HalfAdder("HA2");
        halfAdder2.setIn1Value(Cin.isTerminalValue());
        halfAdder2.setIn2Value(halfAdder1.getOut().isTerminalValue());

        boolean S=halfAdder2.getOut().isTerminalValue();
        boolean Cout=halfAdder1.getOut2().isTerminalValue()||halfAdder2.getOut2().isTerminalValue();

        this.out.setTerminalValue(S);
        this.out2.setTerminalValue(Cout);
    }

    public GateTerminal getOut2() { return out2; }
}
