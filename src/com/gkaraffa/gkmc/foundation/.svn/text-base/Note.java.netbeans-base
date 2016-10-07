package com.gkaraffa.gkmc.foundation;

public class Note extends MusicComponent{
    public Note(){
        super();
    }

    public Note(Tone tTone) throws MusicException{
        super();
        
        setVal(tTone.ordinal());
        setName(tTone.getText());
        setDefined(true);
    }
        
    public Note(String pNote) throws MusicException{
        super();

        Tone tTone = noteStringParse(pNote);
        setVal(tTone.ordinal());
        setName(tTone.getText());
        setDefined(true);
    }

    public Note(Note nOther) throws MusicException{
        //copy constructor
        super();

        if (nOther == null){
            throw (new NullPointerException());
        }

        if (!nOther.getDefined()){
            throw (new MusicException("Originating Note object is undefined."));
        }

        this.setVal(nOther.getVal());
        this.setName(nOther.getName());
        this.setDefined(true);
    }
    
    private Tone noteStringParse(String pNote) throws MusicException{
        Tone tArray[] = Tone.values();
        
        for(Tone tTone : tArray){
            if (tTone.getText().equals(pNote)){
                return tTone;
            }
        }

        throw (new MusicException("Specified note string cannot be parsed"));
    }    
}
