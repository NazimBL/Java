package com.company;

public class AndGate extends TwoInputGate {

    public AndGate(String ref) {
        super(ref);
    }
    @Override
    void evaluate() {
        this.out.setTerminalValue(this.in1.isTerminalValue()&& this.in2.isTerminalValue());
    }
}

