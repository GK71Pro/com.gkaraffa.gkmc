package com.gkaraffa.gkmc.foundation;

public class AlteredDominantScale extends HarmonizableScale{
    public AlteredDominantScale(){
        super();
    }

    public AlteredDominantScale(DorianScale pScale) throws MusicException{
        super(pScale);
    }
	
    public AlteredDominantScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Altered Dominant");
        setTonality(Tonality.DIMINISHED);
        setScaleName(Scale.ALTERED_DOMINANT);
    }

    public AlteredDominantScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseHalfStep(N_tonic));
        noteAdd(Keyboard.traverseWholeStep(noteFind(1)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(2)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Altered Dominant");
        setTonality(Tonality.DIMINISHED);
        setScaleName(Scale.ALTERED_DOMINANT);
    }		
}
