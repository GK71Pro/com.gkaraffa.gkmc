package com.gkaraffa.gkmc.foundation;

import java.util.StringTokenizer;

public abstract class Chord extends NoteSeries {

    private int iToneCount;

    public Chord(int pToneCount) {
        super();
        iToneCount = pToneCount;
    }

    public Note getChordNote(int pSpec) throws MusicException {
        if (!getDefined()) {
            throw new MusicException("Chord not defined.");
        }

        switch (pSpec) {
            case 1:
                return (noteFind(0));
            case 3:
                return (noteFind(1));
            case 5:
                return (noteFind(2));
            case 7:
                if (iToneCount >= 4) {
                    return (noteFind(3));
                } else {
                    throw new MusicException("Chord degree not supported by this type of chord.");
                }
            case 9:
                if (iToneCount >= 5) {
                    return (noteFind(4));
                } else {
                    throw new MusicException("Chord degree not supported by this type of chord.");
                }
            default:
                throw new MusicException("Chord degree not supported.");
        }
    }

    public final String getRootSpellingString() throws MusicException {
        return (getSpellingString());
    }

    public final NoteSeries getRootNoteSeries() throws MusicException {
        return (new NoteSeries(getSpellingNoteSeries()));
    }

    private boolean isLowestInversionExceeded(int iInv) {
        if (iInv < 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isHighestInversionExceeded(int iInv) {
        if (iInv > iToneCount - 1) {
            return true;
        } else {
            return false;
        }
    }

    public final String getInversionSpellingString(int iInv) throws MusicException {
        StringBuilder sB = new StringBuilder();

        if (isLowestInversionExceeded(iInv) || isHighestInversionExceeded(iInv)) {
            throw new MusicException("Not within limits of inversions for this type of chord.");
        }

        for (int index = iInv; index <= iInv + (iToneCount - 1); index++) {
            sB.append(getNote(index).toString());
            sB.append(" ");
        }

        return (sB.toString());
    }

    public final NoteSeries getInversionNoteSeries(int iInv) throws MusicException {
        NoteSeries nS = new NoteSeries();

        if (isLowestInversionExceeded(iInv) || isHighestInversionExceeded(iInv)) {
            throw new MusicException("Not within limits of inversions for this type of chord.");
        }

        for (int index = iInv; index <= iInv + (iToneCount - 1); index++) {
            nS.noteAdd(getNote(index));
        }

        return (nS);
    }

    public final boolean isEnharmonicallyEquivalent(Chord cSubject) throws MusicException {
        if (this.contains(cSubject) && cSubject.contains(this)) {
            return true;
        }

        return false;
    }

    public final String getNameOnly() throws MusicException {
        return (getRemainingBlock(getName()));
    }

    protected final String getNoteBlock(String subject) throws MusicException {
        try {
            StringTokenizer stSplit = new StringTokenizer(subject);
            String alpha = stSplit.nextToken();
            return (alpha);
        } catch (StringIndexOutOfBoundsException e) {
            MusicException me = new MusicException("Caught StringIndexOutOfBoundsException.");
            me.fillInStackTrace();
            throw (me);
        }
    }

    protected final String getRemainingBlock(String subject) throws MusicException {
        try {
            StringTokenizer stSplit = new StringTokenizer(subject);
            int noteBlockLength = stSplit.nextToken().length();
            return (subject.substring(noteBlockLength + 1));
        } catch (StringIndexOutOfBoundsException e) {
            MusicException me = new MusicException("Caught StringIndexOutOfBoundsException.");
            me.fillInStackTrace();
            throw (me);
        }
    }

    public static Chord getChord(Note nKey, String sNameText) {
        Chord cChord = null;

        try {
            if (sNameText.equals(ChordName.MAJOR.getText())) {
                cChord = new Triad(nKey + " " + ChordName.MAJOR.getText());
            } else if (sNameText.equals(ChordName.MINOR.getText())) {
                cChord = new Triad(nKey + " " + ChordName.MINOR.getText());
            } else if (sNameText.equals(ChordName.DIMINISHED.getText())) {
                cChord = new Triad(nKey + " " + ChordName.DIMINISHED.getText());
            } else if (sNameText.equals(ChordName.AUGMENTED.getText())) {
                cChord = new Triad(nKey + " " + ChordName.AUGMENTED.getText());
            } else if (sNameText.equals(ChordName.MAJOR_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.MAJOR_7TH.getText());
            } else if (sNameText.equals(ChordName.MINOR_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.MINOR_7TH.getText());
            } else if (sNameText.equals(ChordName.MINOR_MAJOR_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.MINOR_MAJOR_7TH.getText());
            } else if (sNameText.equals(ChordName.DOMINANT_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.DOMINANT_7TH.getText());
            } else if (sNameText.equals(ChordName.DOMINANT_7TH_FLAT_5.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.DOMINANT_7TH_FLAT_5.getText());
            } else if (sNameText.equals(ChordName.DIMINISHED_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.DIMINISHED_7TH.getText());
            } else if (sNameText.equals(ChordName.HALF_DIMINISHED_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.HALF_DIMINISHED_7TH.getText());
            } else if (sNameText.equals(ChordName.AUGMENTED_MAJOR_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.AUGMENTED_MAJOR_7TH.getText());
            } else if (sNameText.equals(ChordName.AUGMENTED_MINOR_7TH.getText())) {
                cChord = new SeventhChord(nKey + " " + ChordName.AUGMENTED_MINOR_7TH.getText());
            } else if (sNameText.equals(ChordName.MAJOR_7TH_SHARP_9.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.MAJOR_7TH_SHARP_9.getText());
            } else if (sNameText.equals(ChordName.MAJOR_7TH_FLAT_9.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.MAJOR_7TH_FLAT_9.getText());
            } else if (sNameText.equals(ChordName.MAJOR_9TH.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.MAJOR_9TH.getText());
            } else if (sNameText.equals(ChordName.DOMINANT_9TH.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.DOMINANT_9TH.getText());
            } else if (sNameText.equals(ChordName.DOMINANT_7TH_SHARP_9.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.DOMINANT_7TH_SHARP_9.getText());
            } else if (sNameText.equals(ChordName.DOMINANT_7TH_FLAT_9.getText())) {
                cChord = new NinthChord(nKey + " " + ChordName.DOMINANT_7TH_FLAT_9.getText());
            } else {
                throw (new MusicException("Processing not defined for this chord."));
            }
        } catch (MusicException me) {
            me.printStackTrace();
        }
        return (cChord);
    }
    public static final String MAJOR = "Maj";
    public static final String MINOR = "Min";
    public static final String DIMINISHED = "Dim";
    public static final String AUGMENTED = "Aug";
    public static final String MINOR_7TH = "Min 7";
    public static final String MAJOR_7TH = "Maj 7";
    public static final String DOMINANT_7TH = "7";
    public static final String DIMINISHED_7TH = "Dim 7";
    public static final String HALF_DIMINISHED_7TH = "Half Dim 7";
    public static final String MINOR_MAJOR_7TH = "Min/Maj 7";
    public static final String AUGMENTED_MAJOR_7TH = "Aug Maj 7";
    public static final String AUGMENTED_7TH = "Aug 7";
    public static final String MAJOR_9TH = "Maj 9";
    public static final String MAJOR_7TH_SHARP_9 = "Maj 7 #9";
    public static final String MAJOR_7TH_FLAT_9 = "Maj 7 b9";
    public static final String DOMINANT_9TH = "9";
    public static final String DOMINANT_7TH_SHARP_9 = "7 #9";
    public static final String DOMINANT_7TH_FLAT_9 = "7 b9";
    public static final String MINOR_9TH = "Min 9";
    public static final String MINOR_7TH_FLAT_9 = "Min 7 b9";
}
