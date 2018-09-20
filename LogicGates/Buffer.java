package com.company;

public class Buffer extends OneInputGate {

    public Buffer(String ref) {
        super(ref);
    }

    @Override
    void evaluate() {
        this.out.setTerminalValue(this.in.isTerminalValue());
    }
}
