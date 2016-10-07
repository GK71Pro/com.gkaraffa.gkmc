package com.gkaraffa.gkmc.foundation;

public class PentatonicMajorScale extends PentatonicScale{
    public PentatonicMajorScale(){
        super();
    }

    public PentatonicMajorScale(PentatonicMajorScale pScale) throws MusicException{
        super(pScale);
    }

    public PentatonicMajorScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        IonianScale ionianBase = new IonianScale(N_tonic);

        noteAdd(ionianBase.noteFind(0));
        noteAdd(ionianBase.noteFind(1));
        noteAdd(ionianBase.noteFind(2));
        noteAdd(ionianBase.noteFind(4));
        noteAdd(ionianBase.noteFind(5));

        setDefined(true);
        setName(N_tonic.getName() + " Pentatonic Major");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.PENTATONIC_MAJOR);
    }

    public PentatonicMajorScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        IonianScale ionianBase = new IonianScale(N_tonic);

        noteAdd(ionianBase.noteFind(0));
        noteAdd(ionianBase.noteFind(1));
        noteAdd(ionianBase.noteFind(2));
        noteAdd(ionianBase.noteFind(4));
        noteAdd(ionianBase.noteFind(5));

        setDefined(true);
        setName(N_tonic.getName() + " Pentatonic Major");
        setTonality(Tonality.MAJOR);
        setScaleName(Scale.PENTATONIC_MAJOR);
    }
}
