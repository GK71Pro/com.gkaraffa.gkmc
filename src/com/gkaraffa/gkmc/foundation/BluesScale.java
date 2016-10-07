package com.gkaraffa.gkmc.foundation;

public class BluesScale extends NonHarmonizableScale{
    public BluesScale(){
        super();
    }

    public BluesScale(PentatonicMinorScale pScale) throws MusicException{
        super(pScale);
    }

    public BluesScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        AeolianScale aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.noteFind(0));
        noteAdd(aeolianBase.noteFind(2));
        noteAdd(aeolianBase.noteFind(3));
        noteAdd(Keyboard.sharpen(aeolianBase.noteFind(3)));
        noteAdd(aeolianBase.noteFind(4));
        noteAdd(aeolianBase.noteFind(6));

        setDefined(true);
        setName(N_tonic.getName() + " Blues");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.PENTATONIC_MINOR);
    }

    public BluesScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        AeolianScale aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.noteFind(0));
        noteAdd(aeolianBase.noteFind(2));
        noteAdd(aeolianBase.noteFind(3));
        noteAdd(Keyboard.sharpen(aeolianBase.noteFind(3)));
        noteAdd(aeolianBase.noteFind(4));
        noteAdd(aeolianBase.noteFind(6));

        setDefined(true);
        setName(N_tonic.getName() + " Blues");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.PENTATONIC_MINOR);
    }
}