package com.gkaraffa.gkmc.foundation;

public class MinorAdd6BlueScale extends NonHarmonizableScale{
    public MinorAdd6BlueScale(){
        super();
    }

    public MinorAdd6BlueScale(PentatonicMinorScale pScale) throws MusicException{
        super(pScale);
    }

    public MinorAdd6BlueScale(String S_name) throws MusicException{
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
        noteAdd(Keyboard.flatten(aeolianBase.noteFind(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Minor Add 6 Blue");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.MINOR_ADD_6_BLUE);
    }

    public MinorAdd6BlueScale(Note N_tonic) throws MusicException{
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
        noteAdd(Keyboard.flatten(aeolianBase.noteFind(6)));
        
        setDefined(true);
        setName(N_tonic.getName() + " Minor Add 6 Blue");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.MINOR_ADD_6_BLUE);
    }
}