package com.gkaraffa.gkmc.foundation;

public class Interval extends MusicComponent {
	public Interval() throws MusicException {
		super();
	}

	public Interval(Interval iIn) throws MusicException {
		if (!iIn.getDefined()) {
			throw (new MusicException("Source Interval not defined."));
		}

		this.setVal(iIn.getVal());
		this.setName(iIn.getName());
		this.setDefined(true);
	}

	public Interval(int pHalfSteps) throws MusicException {
		if (!isInRange(pHalfSteps)) {
			throw (new MusicException("Input half steps out of range."));
		}

		this.setVal(pHalfSteps);
		this.setName(mapName(pHalfSteps));
		this.setDefined(true);
	}

	private String mapName(int pHalfSteps) {
		String sMappedName = "";

		switch (pHalfSteps) {
			case Interval.ROOT:
				sMappedName = "Root";
				break;

			case Interval.MINOR_2ND:
				sMappedName = "Minor 2nd";
				break;
			case Interval.MAJOR_2ND:
				sMappedName = "Major 2nd";
				break;
			case Interval.MINOR_3RD:
				sMappedName = "Minor 3rd";
				break;

			case Interval.MAJOR_3RD:
				sMappedName = "Major 3rd / Diminished 4th";
				break;

			case Interval.PERFECT_4TH:
				sMappedName = "Perfect 4th";
				break;

			case Interval.AUGMENTED_4TH:
				sMappedName = "Augmented 4th / Diminished 5th";
				break;

			case Interval.PERFECT_5TH:
				sMappedName = "Perfect 5th";
				break;

			case Interval.AUGMENTED_5TH:
				sMappedName = "Augmented 5th / Minor 6th";
				break;

			case Interval.MAJOR_6TH:
				sMappedName = "Major 6th / Diminished 7th";
				break;

			case Interval.MINOR_7TH:
				sMappedName = "Minor 7th";
				break;

			case Interval.MAJOR_7TH:
				sMappedName = "Major 7th";
				break;

			case Interval.AUGMENTED_7TH:
				sMappedName = "Augmented 7th / Octave";
				break;

		}

		return (sMappedName);
	}

	private boolean isInRange(int subject) {
		if ((subject < 0) || (subject > 12)) {
			return (false);
		}

		return (true);
	}

	public int getHalfSteps() {
		return this.getVal();
	}

	public String getIntervalName() {
		return this.getName();
	}
	
	static public final int ROOT = 0;
	static public final int MINOR_2ND = 1;
	static public final int MAJOR_2ND = 2;
	static public final int MINOR_3RD = 3;
	static public final int MAJOR_3RD = 4;
	static public final int DIMINISHED_4TH = 4;
	static public final int PERFECT_4TH = 5;
	static public final int AUGMENTED_4TH = 6;
	static public final int DIMINISHED_5TH = 6;
	static public final int PERFECT_5TH = 7;
	static public final int AUGMENTED_5TH = 8;
	static public final int MINOR_6TH = 8;
	static public final int MAJOR_6TH = 9;
	static public final int DIMINISHED_7TH = 9;
	static public final int MINOR_7TH = 10;
	static public final int MAJOR_7TH = 11;
	static public final int AUGMENTED_7TH = 12;
	static public final int OCTAVE = 12;
	static public final int HALF_STEP = 1;
	static public final int WHOLE_STEP = 2;
}
