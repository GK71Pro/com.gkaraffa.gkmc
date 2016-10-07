package com.gkaraffa.gkmc.foundation;

public class LydianDominantScale extends HarmonizableScale{
	LydianScale lydianBase = null;
	
	public LydianDominantScale(LydianDominantScale pScale) throws MusicException{
        super(pScale);
    }
	
	public LydianDominantScale(String S_name) throws MusicException{
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
		noteAdd(lydianBase.getNote(4));
		noteAdd(lydianBase.getNote(5));
		noteAdd(Keyboard.flatten(lydianBase.getNote(6)));
				
		setDefined(true);
		setName(N_tonic.getName() + " " + Scale.LYDIAN_DOMINANT);
		setTonality(Tonality.MAJOR);
		setScaleName(Scale.LYDIAN_DOMINANT);
	}
	
    public LydianDominantScale(Note N_tonic) throws MusicException{
        super();
        if (!N_tonic.getDefined()){
            return;
        }

		lydianBase = new LydianScale(N_tonic);
		
		noteAdd(lydianBase.getNote(0));
		noteAdd(lydianBase.getNote(1));
		noteAdd(lydianBase.getNote(2));
		noteAdd(lydianBase.getNote(3));
		noteAdd(lydianBase.getNote(4));
		noteAdd(lydianBase.getNote(5));
		noteAdd(Keyboard.flatten(lydianBase.getNote(6)));

		setDefined(true);
		setName(N_tonic.getName() + " " + Scale.LYDIAN_DOMINANT);
		setTonality(Tonality.MAJOR);
		setScaleName(Scale.LYDIAN_DOMINANT);
    }
}
