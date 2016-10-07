package com.gkaraffa.gkmc.foundation;

public class LocrianNatural2ndScale extends HarmonizableScale{
    public LocrianNatural2ndScale(){
        super();
    }

    public LocrianNatural2ndScale(DorianScale pScale) throws MusicException{
        super(pScale);
    }
	
    public LocrianNatural2ndScale(String S_name) throws MusicException{
        super();
        Note N_tonic = new Note(S_name);

        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Locrian Natural 2nd");
        setTonality(Tonality.DIMINISHED);
        setScaleName(Scale.LOCRIAN_NATURAL_2ND);
    }

    public LocrianNatural2ndScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

        noteAdd(N_tonic);
        noteAdd(Keyboard.traverseWholeStep(N_tonic));
        noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(2)));
        noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(4)));
        noteAdd(Keyboard.traverseWholeStep(noteFind(5)));
		
        setDefined(true);
        setName(N_tonic.getName() + " Locrian Natural 2nd");
        setTonality(Tonality.DIMINISHED);
        setScaleName(Scale.LOCRIAN_NATURAL_2ND);
    }	
}
