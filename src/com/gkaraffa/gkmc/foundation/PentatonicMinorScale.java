package com.gkaraffa.gkmc.foundation;

public class PentatonicMinorScale extends PentatonicScale{
    public PentatonicMinorScale(){
        super();
    }

    public PentatonicMinorScale(PentatonicMinorScale pScale) throws MusicException{
        super(pScale);
    }

    public PentatonicMinorScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        AeolianScale aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.noteFind(0));
        noteAdd(aeolianBase.noteFind(2));
        noteAdd(aeolianBase.noteFind(3));
        noteAdd(aeolianBase.noteFind(4));
        noteAdd(aeolianBase.noteFind(6));

        setDefined(true);
        setName(N_tonic.getName() + " Pentatonic Minor");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.PENTATONIC_MINOR);
    }

    public PentatonicMinorScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        AeolianScale aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.noteFind(0));
        noteAdd(aeolianBase.noteFind(2));
        noteAdd(aeolianBase.noteFind(3));
        noteAdd(aeolianBase.noteFind(4));
        noteAdd(aeolianBase.noteFind(6));

        setDefined(true);
        setName(N_tonic.getName() + " Pentatonic Minor");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.PENTATONIC_MINOR);
    }
}
