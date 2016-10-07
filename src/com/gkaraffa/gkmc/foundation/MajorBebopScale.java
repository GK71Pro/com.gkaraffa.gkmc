package com.gkaraffa.gkmc.foundation;

public class MajorBebopScale extends NonHarmonizableScale{
    public MajorBebopScale(){
        super();
    }

    public MajorBebopScale(MajorBebopScale pScale) throws MusicException{
        super(pScale);
    }

    public MajorBebopScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Bebop Major");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.MAJOR_BEBOP);
    }

    public MajorBebopScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Bebop Major");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.MAJOR_BEBOP);
    }
}
