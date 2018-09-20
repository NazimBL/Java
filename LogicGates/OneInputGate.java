package com.company;
public  class OneInputGate extends LogicGate {

    GateTerminal in,out;
    public OneInputGate(String ref){
        super(ref);
        in=new GateTerminal(this,GateTerminal.INPUT,"IN");
        out=new GateTerminal(this,GateTerminal.OUTPUT,"OUT");
    }

    public void setInValue(boolean a){
        this.in.setTerminalValue(a);
    }
    public boolean getOutValue(){
        return this.out.terminalValue;
    }
    public boolean getInValue(){
        return this.in.terminalValue;
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
    public GateTerminal getOut() {
        return out;
    }

    @Override void evaluate() { }
}
