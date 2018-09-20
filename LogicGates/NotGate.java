package com.company;

public class NotGate extends OneInputGate {

    public NotGate(String ref) {
        super(ref);
    }
    @Override
    void evaluate() {
        this.out.setTerminalValue(!this.in.isTerminalValue());
    }
}
