package com.gkaraffa.gkmc.foundation;

public class MixolydianScale extends DiatonicScale{
    public MixolydianScale(){
        super();
    }

    public MixolydianScale(MixolydianScale pScale) throws MusicException{
        super(pScale);
    }

    public MixolydianScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Mixolydian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(noteFind(3));
        setScaleName(Scale.MIXOLYDIAN);
    }

    public MixolydianScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));

        setDefined(true);
        setName(N_tonic.getName() + " Mixolydian");
        setTonality(Tonality.MAJOR);
        setRelativeDiatonicMajorKey(noteFind(3));
        setScaleName(Scale.MIXOLYDIAN);
    }
}
