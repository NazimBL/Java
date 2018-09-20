package com.company;

public class XorGate extends TwoInputGate {
    public XorGate(String ref) {
        super(ref);
    }

    @Override
    void evaluate() {
        this.out.setTerminalValue(this.in1.isTerminalValue()^this.in2.isTerminalValue());
    }
}

