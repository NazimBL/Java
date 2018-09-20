package com.company;

public class OrGate extends TwoInputGate {
    public OrGate(String ref) {
        super(ref);
    }
    @Override
    void evaluate() {
        this.out.setTerminalValue(this.in1.isTerminalValue()||this.in2.isTerminalValue());
    }
}

