package com.gkaraffa.gkmc.foundation;

public enum ChordName {
    MAJOR("Maj"),
    MINOR("Min"),
    DIMINISHED("Dim"),
    AUGMENTED("Aug"),
    MINOR_7TH("Min 7"),
    MAJOR_7TH("Maj 7"),
    DOMINANT_7TH("7"),
	 DOMINANT_7TH_FLAT_5("7 b5"),
    DIMINISHED_7TH("Dim 7"),
    HALF_DIMINISHED_7TH("Half Dim 7"),
    MINOR_MAJOR_7TH("Min/Maj 7"),
    AUGMENTED_MAJOR_7TH("Aug Maj 7"),
    AUGMENTED_MINOR_7TH("Aug Min 7"),
    MAJOR_9TH("Maj 9"),
    MAJOR_7TH_SHARP_9("Maj 7 #9"),
    MAJOR_7TH_FLAT_9("Maj 7 b9"),
    DOMINANT_9TH("9"),
    DOMINANT_7TH_SHARP_9("7 #9"),
    DOMINANT_7TH_FLAT_9("7 b9"),
    MINOR_9TH("Min 9"),
    MINOR_7TH_FLAT_9("Min 7 b9"),   
    MAJOR_ADD_9("(Add 9)"),
    MINOR_ADD_9("Min (Add 9)"),
    DIMINISHED_ADD_9("Dim (Add 9)"),
    AUGMENTED_ADD_9("Aug (Add 9)");
    
    private final String text;
   
    
    ChordName(String text){
        this.text = text;
    }
   
    public String getText() {
        return text;
    }    
}
