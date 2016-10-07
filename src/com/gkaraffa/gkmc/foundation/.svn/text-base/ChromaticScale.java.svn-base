package com.gkaraffa.gkmc.foundation;

public class ChromaticScale extends NonHarmonizableScale{
    public ChromaticScale(){
        super();
    }

    public ChromaticScale(ChromaticScale pScale) throws MusicException{
        super(pScale);
    }

    public ChromaticScale(String sKey) throws MusicException{
        super();
        Note N_tonic = new Note(sKey);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(7)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(8)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(9)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(10)));

        setDefined(true);
        setName(N_tonic.getName() + " Chromatic");
        setTonality(Tonality.CHROMATIC);
        setScaleName(Scale.CHROMATIC);
    }

    public ChromaticScale(Note N_tonic) throws MusicException{
        super();

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(5)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(6)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(7)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(8)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(9)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(10)));

        setDefined(true);
        setName(N_tonic.getName() + " Chromatic");
        setTonality(Tonality.CHROMATIC);
        setScaleName(Scale.CHROMATIC);
    }
}
