package com.company;

public class TwoInputGate extends LogicGate {

    GateTerminal in1,in2;
    GateTerminal out;
    public TwoInputGate(String ref){
        super(ref);
        in1=new GateTerminal(this,GateTerminal.INPUT,"IN1");
        in2=new GateTerminal(this,GateTerminal.INPUT,"IN2");
        out=new GateTerminal(this,GateTerminal.OUTPUT,"OUT");
    }
    public GateTerminal getIn1() {
        return in1;
    }
    public GateTerminal getIn2() {
        return in2;
    }
    public GateTerminal getOut() {
        return out;
    }
    public boolean getOutValue(){
        return this.out.terminalValue;
    }
    public boolean getIn1Value(){
        return this.in1.terminalValue;
    }
    public boolean getIn2Value(){
        return this.in1.terminalValue;
    }
    public void setIn1Value(boolean a){
        this.in1.setTerminalValue(a);
    }
    public void setIn2Value(boolean a){
        this.in2.setTerminalValue(a);
    }
    public void setOutValue(boolean a){
        this.out.setTerminalValue(a);
    }

    public void connectTo(OneInputGate gate){
        //connect this output terminal to gates input
        this.out.connect(gate.in);
    }
    public void connectTo(TwoInputGate tgate,int terminal){
        //connect this output terminal to gates input
        if(terminal==1)this.out.connect(tgate.in1);
        else this.out.connect(tgate.in2);
    }
    @Override
    void evaluate() { }
}
