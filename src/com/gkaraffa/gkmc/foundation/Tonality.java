package com.gkaraffa.gkmc.foundation;

/*
public class Tonality extends MusicComponent{
    public Tonality(int pTonality) throws MusicException{
        if ((pTonality < 0) || (pTonality > (sText.length - 1))){
            throw (new MusicException("Specified tonality not in range"));
        }

        setVal(pTonality);
        setName(sText[pTonality]);
        setDefined(true);
    }

    public Tonality(Tonality tTonality){
        setVal(tTonality.getVal());
        setName(tTonality.toString());
        setDefined(true);
    }

    private final static String[] sText = {
        "MAJOR",
        "MINOR",
        "DIMINISHED",
        "AUGMENTED",
        "CHROMATIC"
    };
    public final static int MAJOR = 0;
    public final static int MINOR = 1;
    public final static int DIMINISHED = 2;
    public final static int AUGMENTED = 3;
    public final static int CHROMATIC = 4;
 * 
 */
 
public enum Tonality{
    MAJOR,
    MINOR,
    DIMINISHED,
    AUGMENTED,
    CHROMATIC
}
