package com.gkaraffa.gkmc.foundation;

public class WholeToneScale extends HarmonizableScale{
    public WholeToneScale(){
        super();
    }

    public WholeToneScale(WholeToneScale pScale) throws MusicException{
        super(pScale);
    }

    public WholeToneScale(String sKey) throws MusicException{
        super();
        Note N_tonic = new Note(sKey);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));

        setDefined(true);
        setName(N_tonic.getName() + " Augmented");
        setTonality(Tonality.AUGMENTED);
        setScaleName(Scale.AUGMENTED);
    }

    public WholeToneScale(Note N_tonic) throws MusicException{
        super();

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));

        setDefined(true);
        setName(N_tonic.getName() + " Augmented");
        setTonality(Tonality.AUGMENTED);
        setScaleName(Scale.AUGMENTED);
    }
}
