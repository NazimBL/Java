package com.company;


public class GateTerminal {

    public static final boolean INPUT=true;
    public static final boolean OUTPUT=false;
    private String terminaReference;
    boolean terminalType;
    boolean terminalValue;
    LogicGate terminalOwner;
    GateTerminal[] terminalConnections;

    public GateTerminal(LogicGate gate,boolean type,String ref){

        this.terminalOwner=gate;
        this.terminalType=type;
        this.terminaReference=ref;
    }

    void connect(GateTerminal terminal){
        if(terminalConnections!=null){
            terminalConnections=addTerminal(terminalConnections,terminal);

        }else{
            terminalConnections=new GateTerminal[1];
            terminalConnections[0]=terminal;
        }
    }

    public boolean isTerminalValue() {

        return terminalValue;
    }

    public void setTerminalValue(boolean terminalValue) {
        this.terminalValue = terminalValue;
        if(this.terminalType==INPUT){

            this.terminalOwner.evaluate();
        }else {
            if(terminalConnections!=null){
                for(GateTerminal t:terminalConnections){
                    t.setTerminalValue(this.terminalValue);
                } }
        }
    }
    public GateTerminal[] addTerminal(GateTerminal[] currentConnections,GateTerminal newConnection){
        GateTerminal[] result=new GateTerminal[currentConnections.length+1];
        for(int i=0;i<currentConnections.length;i++){
            result[i]=currentConnections[i];
        }
        result[currentConnections.length]=newConnection;

    return result;
    }
}
