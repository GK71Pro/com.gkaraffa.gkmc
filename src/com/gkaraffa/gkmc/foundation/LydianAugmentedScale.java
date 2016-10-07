package com.gkaraffa.gkmc.foundation;

public class LydianAugmentedScale extends HarmonizableScale{
	LydianScale lydianBase = null;
	
	public LydianAugmentedScale(LydianAugmentedScale pScale) throws MusicException{
        super(pScale);
    }
	
	public LydianAugmentedScale(String S_name) throws MusicException{
		super();
		Note N_tonic = new Note(S_name);

		if (!N_tonic.getDefined()){
			return;
		}

		lydianBase = new LydianScale(N_tonic);
		
		noteAdd(lydianBase.getNote(0));
		noteAdd(lydianBase.getNote(1));
		noteAdd(lydianBase.getNote(2));
		noteAdd(lydianBase.getNote(3));
		noteAdd(Keyboard.traverseHalfStep(lydianBase.getNote(4)));
		noteAdd(lydianBase.getNote(5));
		noteAdd(lydianBase.getNote(6));
				
		setDefined(true);
		setName(N_tonic.getName() + " " + Scale.LYDIAN_AUGMENTED);
		setTonality(Tonality.AUGMENTED);
		setScaleName(Scale.LYDIAN_AUGMENTED);
	}
	
    public LydianAugmentedScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

		lydianBase = new LydianScale(N_tonic);
		
		noteAdd(lydianBase.getNote(0));
		noteAdd(lydianBase.getNote(1));
		noteAdd(lydianBase.getNote(2));
		noteAdd(lydianBase.getNote(3));
		noteAdd(Keyboard.traverseHalfStep(lydianBase.getNote(4)));
		noteAdd(lydianBase.getNote(5));
		noteAdd(lydianBase.getNote(6));

		setDefined(true);
		setName(N_tonic.getName() + " " + Scale.LYDIAN_AUGMENTED);
		setTonality(Tonality.AUGMENTED);
		setScaleName(Scale.LYDIAN_AUGMENTED);
    }
}
