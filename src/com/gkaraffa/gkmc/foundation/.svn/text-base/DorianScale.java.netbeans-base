package com.gkaraffa.gkmc.foundation;

public class DorianScale extends DiatonicScale{
    public DorianScale(){
        super();
    }

    public DorianScale(DorianScale pScale) throws MusicException{
        super(pScale);
    }

    public DorianScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Dorian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(6));
        setScaleName(Scale.DORIAN);
    }

    public DorianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Dorian");
        setTonality(Tonality.MINOR);
        setRelativeDiatonicMajorKey(noteFind(6));
        setScaleName(Scale.DORIAN);
    }
}
