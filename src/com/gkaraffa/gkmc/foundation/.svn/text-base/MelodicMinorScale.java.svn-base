package com.gkaraffa.gkmc.foundation;

public class MelodicMinorScale extends HarmonizableScale{
    Scale aeolianBase = null;

    public MelodicMinorScale(){
        super();
    }

    public MelodicMinorScale(MelodicMinorScale pScale) throws MusicException{
        super(pScale);
    }

    public MelodicMinorScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.getNote(0));
        noteAdd(aeolianBase.getNote(1));
        noteAdd(aeolianBase.getNote(2));
        noteAdd(aeolianBase.getNote(3));
        noteAdd(aeolianBase.getNote(4));
        noteAdd(Keyboard.traverseHalfStep(aeolianBase.getNote(5)));
        noteAdd(Keyboard.traverseHalfStep(aeolianBase.getNote(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Melodic Minor");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.MELODIC_MINOR);
    }

    public MelodicMinorScale(Note N_tonic) throws MusicException{
        super();

        if (!N_tonic.getDefined()){
            return;
        }

        aeolianBase = new AeolianScale(N_tonic);

        noteAdd(aeolianBase.getNote(0));
        noteAdd(aeolianBase.getNote(1));
        noteAdd(aeolianBase.getNote(2));
        noteAdd(aeolianBase.getNote(3));
        noteAdd(aeolianBase.getNote(4));
        noteAdd(Keyboard.traverseHalfStep(aeolianBase.getNote(5)));
        noteAdd(Keyboard.traverseHalfStep(aeolianBase.getNote(6)));

        setDefined(true);
        setName(N_tonic.getName() + " Melodic Minor");
        setTonality(Tonality.MINOR);
        setScaleName(Scale.MELODIC_MINOR);
    }
}
