package com.gkaraffa.gkmc.foundation;

public abstract class Scale extends NoteSeries {

    private String scaleName = null;

    public Scale() {
        super();
    }

    public Scale(Scale pScale) throws MusicException {
        super(pScale);
        scaleName = pScale.getScaleName();
    }

    public final String getScaleName() {
        return (scaleName);
    }

    public final void setScaleName(String pScaleName) {
        scaleName = pScaleName;
    }

    public int getPosition(Note N_target) throws MusicException {
        if (!getDefined()) {
            throw (new MusicException("Scale not defined."));
        }

        for (int index = 0; index <= (seriesSize() - 1); index++) {
            if (N_target.equals(noteFind(index))) {
                return (index);
            }
        }

        throw (new MusicException("Note does not exist in scale."));
    }
    public static String AEOLIAN = "Aeolian";
    public static String AUGMENTED = "Augmented";
    public static String DOMINANT_BEBOP = "Dominant Bebop";
    public static String MAJOR_BEBOP = "Major Bebop";
    public static String CHROMATIC = "Chromatic";
    public static String DIMINISHED = "Diminished";
    public static String DIMINISHED_WH = "Diminished WH";
    public static String DORIAN = "Dorian";
    public static String DORIAN_FLAT_2ND = "Dorian Flat 2nd";
    public static String HARMONIC_MINOR = "Harmonic Minor";
    public static String IONIAN = "Ionian";
    public static String LOCRIAN = "Locrian";
    public static String LYDIAN = "Lydian";
    public static String MELODIC_MINOR = "Melodic Minor";
    public static String MIXOLYDIAN = "Mixolydian";
    public static String MIXOLYDIAN_FLAT_6TH = "Mixolydian Flat 6th";
    public static String LOCRIAN_NATURAL_2ND = "Locrian Natural 2nd";
    public static String ALTERED_DOMINANT = "Altered Dominant";
    public static String PENTATONIC_MAJOR = "Pentatonic Major";
    public static String PENTATONIC_MINOR = "Pentatonic Minor";
    public static String BLUES = "Blues";
    public static String PHRYGIAN = "Phrygian";
    public static String DORIAN_HARMONIC_MINOR = "Dorian Harmonic Minor";
    public static String PHRYGIAN_HARMONIC_MINOR = "Phrygian Harmonic Minor";
    public static String DORIAN_MELODIC_MINOR = "Dorian Melodic Minor";
    public static String PHRYGIAN_MELODIC_MINOR = "Phrygian Melodic Minor";
    public static String ENIGMATIC = "Enigmatic";
    public static String LYDIAN_AUGMENTED = "Lydian Augmented";
    public static String LYDIAN_DOMINANT = "Lydian Dominant";
    public static String MINOR_ADD_6_BLUE = "Minor Add 6 Blue";
    public static String HUNGARIAN_MINOR = "Hungarian Minor";
}
