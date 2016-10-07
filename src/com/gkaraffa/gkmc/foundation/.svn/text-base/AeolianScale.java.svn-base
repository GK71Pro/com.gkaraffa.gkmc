package com.gkaraffa.gkmc.foundation;

public class AeolianScale extends DiatonicScale{
    public AeolianScale(){
        super();
    }

    public AeolianScale(AeolianScale pScale) throws MusicException{
        super(pScale);
    }

    public AeolianScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Aeolian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(2));
        setScaleName(Scale.AEOLIAN);
    }

    public AeolianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Aeolian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(2));
        setScaleName(Scale.AEOLIAN);
    }
}
 
 