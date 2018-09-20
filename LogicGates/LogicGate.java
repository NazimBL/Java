package com.company;

public abstract class LogicGate {

    String reference;
    public LogicGate(String ref){
        this.reference=ref;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    abstract void evaluate();

}

