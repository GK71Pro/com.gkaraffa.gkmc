package com.gkaraffa.gkmc.foundation;

import java.util.*;

public class NinthChord extends Chord{
    public NinthChord(){
        super(5);
    }

    public NinthChord(NinthChord pChord) throws MusicException{
        super(5);

        if (!pChord.getDefined()){
            throw new MusicException("Source NinthChord is undefined.");
        }

        noteAdd(pChord.getChordNote(1));
        noteAdd(pChord.getChordNote(3));
        noteAdd(pChord.getChordNote(5));
        noteAdd(pChord.getChordNote(7));
        noteAdd(pChord.getChordNote(9));

        setName(pChord.getName());
        setDefined(true);
    }

    public NinthChord(Note nTonic, HarmonizableScale hsScale) throws MusicException{
        super(5);
        int iTp;
        Note nThird;
        Note nFifth;
        Note nSeventh;
        Note nNinth;
        int iThird;
        int iFifth;
        int iSeventh;
        int iNinth;
        String sNameText;

        if (!nTonic.getDefined() || !hsScale.getDefined()){
            throw new MusicException("Scale or Tonic undefined.");
        }

        iTp = hsScale.getPosition(nTonic);
        nThird = hsScale.getNote(iTp + 2);
        nFifth = hsScale.getNote(iTp + 4);
        nSeventh = hsScale.getNote(iTp + 6);
        nNinth = hsScale.getNote(iTp + 1);

        noteAdd(new Note(nTonic));
        noteAdd(nThird);
        noteAdd(nFifth);
        noteAdd(nSeventh);
        noteAdd(nNinth);

        iThird = Keyboard.measureHalfSteps(nTonic, nThird);
        iFifth = Keyboard.measureHalfSteps(nTonic, nFifth);
        iSeventh = Keyboard.measureHalfSteps(nTonic, nSeventh);
        iNinth = Keyboard.measureHalfSteps(nTonic, nNinth);

        if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MAJOR_7TH
                && iNinth == Interval.MAJOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_9TH.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MAJOR_7TH
                && iNinth == Interval.MINOR_3RD){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH_SHARP_9.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MAJOR_7TH
                && iNinth == Interval.MINOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH_FLAT_9.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH
                && iNinth == Interval.MAJOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_9TH.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH
                && iNinth == Interval.MINOR_3RD){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_SHARP_9.getText();
        }
        else if (iThird == Interval.MAJOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH
                && iNinth == Interval.MINOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_FLAT_9.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH
                && iNinth == Interval.MAJOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MINOR_9TH.getText();
        }
        else if (iThird == Interval.MINOR_3RD
                && iFifth == Interval.PERFECT_5TH
                && iSeventh == Interval.MINOR_7TH
                && iNinth == Interval.MINOR_2ND){
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MINOR_7TH_FLAT_9.getText();
        }
        else{
            throw (new MusicException("Ninth chord cannot be created."));
        }

        setDefined(true);
        setName(nTonic + " " + sNameText);
    }

    public NinthChord(String sName) throws MusicException{
        super(5);

        String sNote = this.getNoteBlock(sName);
        String sRemaining = this.getRemainingBlock(sName);
        String sNameText;
        Note nFirst;
        Note nThird = null;
        Note nFifth = null;
        Note nSeventh = null;
        Note nNinth = null;

        nFirst = new Note(sNote);
        if (sRemaining.equals(ChordName.MAJOR_9TH.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            nNinth = Keyboard.traverseMajorSecond(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_9TH.getText();
        }
        else if (sRemaining.equals(ChordName.MAJOR_7TH_SHARP_9.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            nNinth = Keyboard.traverseMinorThird(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH_SHARP_9.getText();
        }
        else if (sRemaining.equals(ChordName.MAJOR_7TH_FLAT_9.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMajorSeventh(nFirst);
            nNinth = Keyboard.traverseMinorSecond(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.MAJOR_7TH_FLAT_9.getText();
        }
        else if (sRemaining.equals(ChordName.DOMINANT_9TH.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            nNinth = Keyboard.traverseMajorSecond(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_9TH.getText();
        }
        else if (sRemaining.equals(ChordName.DOMINANT_7TH_SHARP_9.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            nNinth = Keyboard.traverseMinorThird(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_SHARP_9.getText();
        }
        else if (sRemaining.equals(ChordName.DOMINANT_7TH_FLAT_9.getText())){
            nThird = Keyboard.traverseMajorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            nNinth = Keyboard.traverseMinorSecond(nFirst);
            setTonality(Tonality.MAJOR);
            sNameText = ChordName.DOMINANT_7TH_FLAT_9.getText();
        }
        else if (sRemaining.equals(ChordName.MINOR_9TH.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            nNinth = Keyboard.traverseMajorSecond(nFirst);
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_9TH.getText();
        }
        else if (sRemaining.equals(ChordName.MINOR_7TH_FLAT_9.getText())){
            nThird = Keyboard.traverseMinorThird(nFirst);
            nFifth = Keyboard.traversePerfectFifth(nFirst);
            nSeventh = Keyboard.traverseMinorSeventh(nFirst);
            nNinth = Keyboard.traverseMinorSecond(nFirst);
            setTonality(Tonality.MINOR);
            sNameText = ChordName.MINOR_7TH_FLAT_9.getText();
        }
        else{
            throw (new MusicException("String cannot be parsed into a valid ninth chord"));
        }

        noteAdd(nFirst);
        noteAdd(nThird);
        noteAdd(nFifth);
        noteAdd(nSeventh);
        noteAdd(nNinth);
        setDefined(true);
        setName(nFirst.toString() + " " + sNameText);
    }


    public static ArrayList<Chord> getNinthChordList(Note nTonic, Scale hScale) throws MusicException{
        ArrayList<Chord> alOutput = new ArrayList<Chord>();
        Note nThird;
        Note nFifth;
        Note nSeventh;
        Note nNinth;
        boolean bMinorThirdExists = false;
        boolean bMajorThirdExists = false;
        //boolean bDimFifthExists = false;
        boolean bPerfFifthExists = false;
        //boolean bAugFifthExists = false;
        boolean bMinorSeventhExists = false;
        boolean bMajorSeventhExists = false;
        //boolean bDimSeventhExists = false;
        boolean bNinthExists = false;
        boolean bFlatNinthExists = false;
        boolean bSharpNinthExists = false;


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
            bMinorThirdExists = true;
        }
        else{
            bMinorThirdExists = false;
        }

        //major third search
        nThird = Keyboard.traverseMajorThird(nTonic);
        if (hScale.containsNote(nThird)){
            //found major third
            bMajorThirdExists = true;
        }
        else{
            bMajorThirdExists = false;
        }

        //Fifths search
        //perfect fifth search
        nFifth = Keyboard.traversePerfectFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found minor third
            bPerfFifthExists = true;
        }
        else{
            bPerfFifthExists = false;
        }
        
        //diminished fifth search
        /*
        nFifth = Keyboard.traverseDiminishedFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found minor third
            bDimFifthExists = true;
        }
        else{
            bDimFifthExists = false;
        }
        */

        //augmented fifth search
        /*
        nFifth = Keyboard.traverseAugmentedFifth(nTonic);
        if (hScale.containsNote(nFifth)){
            //found minor third
            bAugFifthExists = true;
        }
        else{
            bAugFifthExists = false;
        }
        */
        
        //Sevenths search
        //diminished seventh search
        /*
        nSeventh = Keyboard.traverseDiminishedSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found minor seventh
            bDimSeventhExists = true;
        }
        else{
            bDimSeventhExists = false;
        }
        */
        
        //minor seventh search
        nSeventh = Keyboard.traverseMinorSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found minor seventh
            bMinorSeventhExists = true;
        }
        else{
            bMinorSeventhExists = false;
        }

        //major seventh search
        nSeventh = Keyboard.traverseMajorSeventh(nTonic);
        if (hScale.containsNote(nSeventh)){
            //found major seventh
            bMajorSeventhExists = true;
        }
        else{
            bMajorSeventhExists = false;
        }

        //Ninths search
        //Ninth
        nNinth = Keyboard.traverseMajorSecond(nTonic);
        if (hScale.containsNote(nNinth)){
            bNinthExists = true;
        }
        else{
            bNinthExists = false;
        }

        //Flat Ninth
        nNinth = Keyboard.traverseMinorSecond(nTonic);
        if (hScale.containsNote(nNinth)){
            bFlatNinthExists = true;
        }
        else{
            bFlatNinthExists = false;
        }

        //Sharp Ninth
        if(bMajorThirdExists && bMinorThirdExists){
            bMinorThirdExists = false;
            bSharpNinthExists = true;
        }


        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMajorSeventhExists) && (bNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.MAJOR_9TH.getText()));
        }

        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMajorSeventhExists) && (bFlatNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.MAJOR_7TH_FLAT_9.getText()));
        }

        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMajorSeventhExists) && (bSharpNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.MAJOR_7TH_SHARP_9.getText()));
        }

        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMinorSeventhExists) && (bNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.DOMINANT_9TH.getText()));
        }

        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMinorSeventhExists) && (bFlatNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.DOMINANT_7TH_FLAT_9.getText()));
        }

        if ((bMajorThirdExists) && (bPerfFifthExists) && (bMinorSeventhExists) && (bSharpNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.DOMINANT_7TH_SHARP_9.getText()));
        }

        if ((bMinorThirdExists) && (bPerfFifthExists) && (bMinorSeventhExists) && (bNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.MINOR_9TH.getText()));
        }

        if ((bMinorThirdExists) && (bPerfFifthExists) && (bMinorSeventhExists) && (bFlatNinthExists)){
            alOutput.add(new NinthChord(nTonic.toString() + " " + ChordName.MINOR_7TH_FLAT_9.getText()));
        }                
        
//        if ((bMinorThirdExists) && (bDimFifthExists) && (bDimSeventhExists) && (bFlatNinthExists)){
//        }

        return (alOutput);
    }

}
