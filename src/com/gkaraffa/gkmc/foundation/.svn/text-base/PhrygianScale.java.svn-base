package com.gkaraffa.gkmc.foundation;

public class PhrygianScale extends DiatonicScale{
    public PhrygianScale(){
        super();
    }

    public PhrygianScale(PhrygianScale pScale) throws MusicException{
        super(pScale);
    }

    public PhrygianScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Phrygian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(5));
        setScaleName(Scale.PHRYGIAN);
    }

    public PhrygianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Phrygian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(5));
        setScaleName(Scale.PHRYGIAN);
    }
}
