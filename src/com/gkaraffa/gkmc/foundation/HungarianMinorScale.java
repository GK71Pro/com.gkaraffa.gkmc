package com.gkaraffa.gkmc.foundation;

public class HungarianMinorScale extends NonHarmonizableScale {

	public HungarianMinorScale() {
		super();
	}

	public HungarianMinorScale(NonHarmonizableScale pScale)
			throws MusicException {
		super(pScale);
	}

	public HungarianMinorScale(String sKey) throws MusicException {
		super();
		Note N_tonic = new Note(sKey);

		if (!N_tonic.getDefined()) {
			return;
		}

		noteAdd(N_tonic);
		noteAdd(Keyboard.traverseWholeStep(N_tonic));
		noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
		noteAdd(Keyboard.traverseAugmentedSecond(noteFind(2)));
		noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
		noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
		noteAdd(Keyboard.traverseAugmentedSecond(noteFind(5)));

		setDefined(true);
		setName(N_tonic.getName() + " Hungarian Minor");
		setTonality(Tonality.MINOR);
		setScaleName(Scale.HUNGARIAN_MINOR);
	}

	public HungarianMinorScale(Note N_tonic) throws MusicException {
		super();

		if (!N_tonic.getDefined()) {
			return;
		}

		noteAdd(N_tonic);
		noteAdd(Keyboard.traverseWholeStep(N_tonic));
		noteAdd(Keyboard.traverseHalfStep(noteFind(1)));
		noteAdd(Keyboard.traverseAugmentedSecond(noteFind(2)));
		noteAdd(Keyboard.traverseHalfStep(noteFind(3)));
		noteAdd(Keyboard.traverseHalfStep(noteFind(4)));
		noteAdd(Keyboard.traverseAugmentedSecond(noteFind(5)));

		setDefined(true);
		setName(N_tonic.getName() + " Hungarian Minor");
		setTonality(Tonality.MINOR);
		setScaleName(Scale.HUNGARIAN_MINOR);
	}
}
