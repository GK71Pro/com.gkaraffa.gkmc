package com.gkaraffa.gkmc.foundation;

import java.util.*;

public class SeventhChord extends Chord{
    public SeventhChord(){
        super(4);
    }

    public SeventhChord(String sName) throws MusicException{
        super(4);

        String sNote = this.getNoteBlock(sName);
        String sRemaining = this.getRemainingBlock(sName);
        String sNameText;
        Note nFirst;
        Note nThird = null;
        Note nFifth = null;
        Note nSeventh = null;

        nFirst = new Note(sNote);
        if (sRemaining.equals(ChordName.MAJOR_7TH.getText())){
            //MAJOR 7TH
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.MINOR_7TH.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.DOMINANT_7TH.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.DOMINANT_7TH_FLAT_5.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traverseDiminishedFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_FLAT_5.getText();
        }
        else if (sRemaining.equals(ChordName.DIMINISHED_7TH.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traverseDiminishedFifth(nFirst);
            nSeventh = Keyboard.traverseDiminishedSeventh(nFirst);
            setTonality(Tonality.DIMINISHED);
            sNameText = ChordName.DIMINISHED_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.HALF_DIMINISHED_7TH.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traverseDiminishedFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            setTonality(Tonality.DIMINISHED);
            sNameText = ChordName.HALF_DIMINISHED_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.MINOR_MAJOR_7TH.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_MAJOR_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.AUGMENTED_MAJOR_7TH.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traverseAugmentedFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            setTonality(Tonality.AUGMENTED);
            sNameText = ChordName.AUGMENTED_MAJOR_7TH.getText();
        }
        else if (sRemaining.equals(ChordName.AUGMENTED_MINOR_7TH.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traverseAugmentedFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            setTonality(Tonality.AUGMENTED);
            sNameText = ChordName.AUGMENTED_MINOR_7TH.getText();
        }
        else{
            throw (new MusicException("String cannot be parsed into a valid seventh chord :: " + sRemaining + " :: " + ChordName.AUGMENTED_MAJOR_7TH.getText()));
        }

        noteAdd(nFirst);
        noteAdd(nThird);
        noteAdd(nFifth);
        noteAdd(nSeventh);
        setDefined(true);
        setName(nFirst.toString() + " " + sNameText);

    }

    public SeventhChord(Note nTonic, HarmonizableScale hsScale) throws MusicException{
        super(4);
        int iTp;
        Note nThird;
        Note nFifth;
        Note nSeventh;
        int iThird;
        int iFifth;
        int iSeventh;
        String sNameText;

        if (!nTonic.getDefined() || !hsScale.getDefined()){
            return;
        }

        iTp = hsScale.getPosition(nTonic);

        nThird = hsScale.getNote(iTp + 2);
        nFifth = hsScale.getNote(iTp + 4);
        nSeventh = hsScale.getNote(iTp + 6);

        noteAdd(new Note(nTonic));
        noteAdd(nThird);
        noteAdd(nFifth);
        noteAdd(nSeventh);

        iThird = Keyboard.measureHalfSteps(nTonic, nThird);
        iFifth = Keyboard.measureHalfSteps(nTonic, nFifth);
        iSeventh = Keyboard.measureHalfSteps(nTonic, nSeventh);

        if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MAJOR_7TH){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH){
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_7TH.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH.getText();
        }
		else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.DIMINISHED_5TH
                && iSeventh == Interval.MINOR_7TH){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_FLAT_5.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.DIMINISHED_5TH
                && iSeventh == Interval.DIMINISHED_7TH){
            setTonality(Tonality.DIMINISHED);
            sNameText = ChordName.DIMINISHED_7TH.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.DIMINISHED_5TH
                && iSeventh == Interval.MINOR_7TH){
            setTonality(Tonality.DIMINISHED);
            sNameText = ChordName.HALF_DIMINISHED_7TH.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MAJOR_7TH){
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_MAJOR_7TH.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.AUGMENTED_5TH
                && iSeventh == Interval.MAJOR_7TH){
            setTonality(Tonality.AUGMENTED);
            sNameText = ChordName.AUGMENTED_MAJOR_7TH.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.AUGMENTED_5TH
                && iSeventh == Interval.MINOR_7TH){
            setTonality(Tonality.AUGMENTED);
            sNameText = ChordName.AUGMENTED_MINOR_7TH.getText();
        }
        else{
            throw (new MusicException("Seventh chord cannot be created."));
        }

        setDefined(true);
        setName(nTonic + " " + sNameText);
    }

    public SeventhChord(SeventhChord SC_subj) throws MusicException{
        super(4);

        if (!SC_subj.getDefined()){
            return;
        }

        noteAdd(SC_subj.getChordNote(1));
        noteAdd(SC_subj.getChordNote(3));
        noteAdd(SC_subj.getChordNote(5));
        noteAdd(SC_subj.getChordNote(7));
        setDefined(true);
        setTonality(SC_subj.getTonality());
        setName(SC_subj.getName());
    }

    public static ArrayList<Chord> getSeventhChordList(Note nTonic, Scale hScale) throws MusicException{
        ArrayList<Chord> alOutput = new ArrayList<Chord>();
        Note nThird;
        Note nFifth;
        Note nSeventh;
        boolean bMinorTExist = false;
        boolean bMajorTExist = false;
        boolean bDimFExist = false;
        boolean bPerfFExist = false;
        boolean bAugFExist = false;
        boolean bMinorSExist = false;
        boolean bMajorSExist = false;
        boolean bDimSExist = false;


        if (nTonic.getDefined() != true){
            return (null);
        }

        if (hScale.getDefined() != true){
            return (null);
        }

        //Interval Search
        //Thirds search
        //minor third search
        nThird = Keyboard.traverseMinorThird(nTonic);
        if (hScale.containsNote(nThird)){
            //found minor third
            bMinorTExist = true;
        }
        else{
            bMinorTExist = false;
        }

        //major third search
        nThird = Keyboard.traverseMajorThird(nTonic);
        if (hScale.containsNote(nThird)){
            //found major third
            bMajorTExist = true;
        }
        else{
            bMajorTExist = false;
        }

        //Fifths search
        //dimimished fifth search
        nFifth = Keyboard.traverseDiminishedFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found minor third
            bDimFExist = true;
        }
        else{
            bDimFExist = false;
        }

        //perfect fifth search
        nFifth = Keyboard.traversePerfectFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found minor third
            bPerfFExist = true;
        }
        else{
            bPerfFExist = false;
        }

        //augmented fifth search
        nFifth = Keyboard.traverseAugmentedFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found augmented fifth
            bAugFExist = true;
        }
        else{
            bAugFExist = false;
        }

        //Sevenths search
        //dimimished seventh search
        nSeventh = Keyboard.traverseDiminishedSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found dimimished seventh
            bDimSExist = true;
        }
        else{
            bDimSExist = false;
        }

        //minor seventh search
        nSeventh = Keyboard.traverseMinorSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found minor seventh
            bMinorSExist = true;
        }
        else{
            bMinorSExist = false;
        }

        //major seventh search
        nSeventh = Keyboard.traverseMajorSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found major seventh
            bMajorSExist = true;
        }
        else{
            bMajorSExist = false;
        }

        if ((bMinorTExist) && (bPerfFExist) && (bMinorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.MINOR_7TH.getText()));
        }

        if ((bMinorTExist) && (bPerfFExist) && (bMajorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.MINOR_MAJOR_7TH.getText()));
        }

        if ((bMinorTExist) && (bDimFExist) && (bMinorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.HALF_DIMINISHED_7TH.getText()));
        }

        if ((bMinorTExist) && (bDimFExist) && (bDimSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.DIMINISHED_7TH.getText()));
        }

        if ((bMajorTExist) && (bPerfFExist) && (bMajorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.MAJOR_7TH.getText()));
        }

        if ((bMajorTExist) && (bPerfFExist) && (bMinorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.DOMINANT_7TH.getText()));
        }
		
        if ((bMajorTExist) && (bDimFExist) && (bMinorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.DOMINANT_7TH_FLAT_5.getText()));
        }

        if ((bMajorTExist) && (bAugFExist) && (bMajorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.AUGMENTED_MAJOR_7TH.getText()));
        }
		
        if ((bMajorTExist) && (bAugFExist) && (bMinorSExist)){
            alOutput.add(new SeventhChord(nTonic.toString() + " " + ChordName.AUGMENTED_MINOR_7TH.getText()));
        }

        return (alOutput);
    }
}
