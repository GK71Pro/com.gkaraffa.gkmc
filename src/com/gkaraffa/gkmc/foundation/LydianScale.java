package com.gkaraffa.gkmc.foundation;

public class LydianScale extends DiatonicScale{
    public LydianScale(){
        super();
    }

    public LydianScale(LydianScale pScale) throws MusicException{
        super(pScale);
    }

    public LydianScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Lydian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(noteFind(4));
        setScaleName(Scale.LYDIAN);
    }

    public LydianScale(Note N_tonic) throws MusicException{
        super();

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Lydian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(noteFind(4));
        setScaleName(Scale.LYDIAN);
    }
}
