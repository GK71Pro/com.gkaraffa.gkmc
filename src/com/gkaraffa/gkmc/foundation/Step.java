package com.gkaraffa.gkmc.foundation;

public enum Step {
    WHOLESTEP("W"),
    HALFSTEP("H");
   
    private final String text;
    
    Step(String text){
        this.text = text;
    }
   
    public String getText() {
        return text;
    }	
}
