package com.gkaraffa.gkmc.foundation;

public class LocrianScale extends DiatonicScale{
    public LocrianScale(){
        super();
    }

    public LocrianScale(LocrianScale pScale) throws MusicException{
        super(pScale);
    }

    public LocrianScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Locrian");
        setTonality(Tonality.DIMINISHED);
        setRelativeDiatonicMajorKey(noteFind(1));
        setScaleName(Scale.LOCRIAN);
    }

    public LocrianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Locrian");
        setTonality(Tonality.DIMINISHED);
        setRelativeDiatonicMajorKey(noteFind(1));
        setScaleName(Scale.LOCRIAN);
    }
}
