package com.gkaraffa.gkmc.foundation;

public class DominantBebopScale extends NonHarmonizableScale{
    public DominantBebopScale(){
        super();
    }

    public DominantBebopScale(DominantBebopScale pScale) throws MusicException{
        super(pScale);
    }

    public DominantBebopScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Bebop Dominant");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.DOMINANT_BEBOP);
    }

    public DominantBebopScale(Note N_tonic) throws MusicException{
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
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Bebop Dominant");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.DOMINANT_BEBOP);
    }
}
