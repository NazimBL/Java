package com.company;

public class HalfAdder extends TwoInputGate {

    GateTerminal out2;
    public HalfAdder(String ref) {
        super(ref);
        in1=new GateTerminal(this,GateTerminal.INPUT,"IN1");
        in2=new GateTerminal(this,GateTerminal.INPUT,"IN2");
        out=new GateTerminal(this,GateTerminal.OUTPUT,"S");
        this.out2=new GateTerminal(this,GateTerminal.OUTPUT,"C");
    }

    @Override
    void evaluate() {
        this.out.setTerminalValue(this.in1.isTerminalValue()||this.in2.isTerminalValue());
        this.out2.setTerminalValue(this.in1.isTerminalValue()&& this.in2.isTerminalValue());
    }

    public GateTerminal getOut2() {
        return out2;
    }
}
