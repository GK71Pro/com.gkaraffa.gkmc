package com.gkaraffa.gkmc.foundation;

public class DiminishedScale extends HarmonizableScale{
    public DiminishedScale(){
        super();
    }

    public DiminishedScale(DiminishedScale pScale) throws MusicException{
        super(pScale);
    }

    public DiminishedScale(String sKey) throws MusicException{
        super();
        Note N_tonic = new Note(sKey);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Diminished");
        setTonality(Tonality.DIMINISHED);        
        setScaleName(Scale.DIMINISHED);
    }

    public DiminishedScale(Note N_tonic) throws MusicException{
        super();

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Diminished");
        setTonality(Tonality.DIMINISHED);
        setScaleName(Scale.DIMINISHED);
    }
}
